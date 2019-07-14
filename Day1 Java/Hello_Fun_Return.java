class Hello_Fun_Return
{
	public static String printHello()
	{
		return "Hello World";		
	}
	public static void main(String args[])
	{
		String hello=new String(printHello());
		System.out.println(hello);
	}
}