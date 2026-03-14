class A
{
	static
	{
		System.out.println("Static block A");
	}
}
public class Q32 
{
	static void show() throws ClassNotFoundException
	{
		System.out.println("Show start");
		Class.forName("B");
		System.out.println("Show end");
	}

	public static void main(String[] args) 
	{
		    System.out.println("Main start");
		    try
		    {
		    	show();
		    }
		    catch(ClassNotFoundException e)
		    {
		    	System.out.println("Hi"+e);
		    }
		    System.out.println("Main end");
	}

}