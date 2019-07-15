import java.util.*;

class FiboSumUsingArrayList
{

	public static ArrayList<Integer> getFibonacciSeries(int series_len)
	{	int f1=1,f2=1;
		ArrayList<Integer> output= new ArrayList<Integer>();
		if(series_len==1)
		{
			output.add(1);
			output.add(1);
			return output;
		}
		else
		{
			output.add(1);
			output.add(1);
			while(true)
			{
				if(f1+f2>series_len)
				{
					break;
				}
				output.add(f1+f2);
				f1=f2;
				f2=output.get(output.size()-1);
			}
			return output;
		}
		
	}	
	

	public static void main(String args[])
	{
		int series_len;
		Scanner in=new Scanner(System.in);
		series_len=in.nextInt();
		ArrayList<Integer> output=getFibonacciSeries(series_len);
		for(int t:output)
		{
			System.out.print(t+" ");
		}
	}
}