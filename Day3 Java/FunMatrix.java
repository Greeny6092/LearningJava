import java.util.*;

class FunMatrix
{	
	public static void main(String args[])
	{
		int input;
		Scanner in=new Scanner(System.in);
		input=in.nextInt();
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<input;j++)
			{
				System.out.print(((i+j)%input));
			}
			System.out.println();
		}
	}
}