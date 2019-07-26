import java.util.*;

class FatherSon
{
		
	static int no;
	static String father[]=new String[100];
	static String son[]=new String[100];
	static LinkedHashSet<String> fatherQueue=new LinkedHashSet<String>();
	static void printChild(String root,String curfather,int level)
	{
		LinkedHashSet<String> childQueue=new LinkedHashSet<String>();
		//System.out.println(root+" "+level);
		for(int j=0;j<no;j++)
			{
				if(father[j].equals(curfather))
				{
					//System.out.print(son[j]+" ");
					childQueue.add(son[j]);
				}
			}
		System.out.println("\n");
		System.out.println(root+" "+level);
		for(String t:childQueue)
		{
			System.out.print(t+" ");
		}
		for(String t:childQueue)
		{	
			if(fatherQueue.contains(t))
			{ 
				printChild(root,t,level+1);
			}
		}
	}
	
	public static void main(String args[])throws ConcurrentModificationException
	{
		
		Scanner in=new Scanner(System.in);
		
		LinkedHashSet<String> childQueue=new LinkedHashSet<String>();
		no=in.nextInt();
		
		for(int i=0;i<no;i++)
		{
			father[i]=new String(in.next());
			fatherQueue.add(father[i]);
			son[i]=new String(in.next());
		}
		
		Iterator<String> i=fatherQueue.iterator();
		while(i.hasNext())
		{	String temp=i.next();
			System.out.println("\n");
			printChild(temp,temp,1);

		}
	}
}