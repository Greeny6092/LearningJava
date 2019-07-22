import java.util.*;

class FunMatrixRecurse
{	
	static void print(int n,int limit)
	{
		if(n!=(limit*limit))
		{
			System.out.print((((n%limit)+(n/limit))%limit)+" ");
			if((n+1)%limit==0)
				System.out.println("");
			print(++n,limit);
		}
	}
	
	public static void main(String args[])
	{
		int input;
		Scanner in=new Scanner(System.in);
		input=in.nextInt();
		print(0,input);
	}
}