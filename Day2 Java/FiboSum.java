import java.util.*;

class FiboSum
{
	private int length;
	public  int[] getFibonacciSeries(int series_len)
	{	int f1=1,f2=1;
		if(series_len==1)
		{
			int output[]=new int[1];
			output[0]=output[1]=f1;
			length=2;
			return output;
		}
		else
		{
			int output[]=new int[series_len],i=2;
			output[0]=output[1]=f1;
			length=2;
			while(true)
			{
				if(f1+f2>series_len)
				{
					break;
				}
				output[i]=f1+f2;
				length++;
				f1=f2;
				f2=output[i];
				i++;
			}
			return output;
		}
		
	}	
	
	void print(int a[])
	{
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
	public static void main(String args[])
	{
		int series_len;
		Scanner in=new Scanner(System.in);
		series_len=in.nextInt();
		FiboSum obj=new FiboSum();
		int output[]=obj.getFibonacciSeries(series_len);
		obj.print(output);
	}
}