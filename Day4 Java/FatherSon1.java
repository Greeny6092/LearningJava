import java.util.*;

class FatherSon1
{
	static int adjmat[][]=new int[100][100];
	static LinkedHashSet<String> queue=new LinkedHashSet<String>();
	static ArrayList<String> queuee=new ArrayList<String>();
	
	static void findChild(int root,int father,int level)
	{	int i;
		for(i=0;i<queue.size();i++)
		{
			if(adjmat[root][i]==1)
			{
				break;
			}
		}
		if(i<queue.size())
		{
			System.out.println(queuee.get(root)+""+level);
			Queue<Integer> q=new LinkedList<Integer>();
			for(i=0;i<queue.size();i++)
			{
				if(adjmat[root][i]==1)
				{
					q.add(i);
					printChild(i);
				}
			}
			
			for(int t:q)
			{
				findChild(root,t,level+1);
			}
		}
		
	}
	
	static void printChild(int root)
	{
		for(int i=0;i<queue.size();i++)
		{
			if(adjmat[root][i]==1)
			{System.out.print(queuee.get(i)+" ");}
		}
		System.out.println("");	
	}
	
	public static void main(String args[])throws ConcurrentModificationException
	{
		int no;
		Scanner in=new Scanner(System.in);
		String father[]=new String[100];
		String son[]=new String[100];
		Queue<Integer> q=new LinkedList<Integer>();
		no=in.nextInt();
		
		for(int i=0;i<no;i++)
		{
			father[i]=new String(in.next());
			queue.add(father[i]);
			son[i]=new String(in.next());
			queue.add(son[i]);
		}
		
		for(String t:queue)
		{
			queuee.add(t);
		}
		
		for(String t:queue)
		{
			System.out.print(t+" ");
		}
		System.out.println("");
		for(String t:queuee)
		{
			for(int i=0;i<no;i++)
			{
				if(father[i].equals(t))
				{
					adjmat[queuee.indexOf(t)][queuee.indexOf(son[i])]=1;
				}
			}
		}
		
		for(int i=0;i<no;i++)
		{	
			findChild(i,i,1);
		}
	}
}