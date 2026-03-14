class A
{
	static
	{
		System.out.println("Static block A");
	}
}
public class Q30
{
	static void show() 
	{
		System.out.println("Show start");
		try {
			Class.forName("B");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Hi"+e);
		}
		System.out.println("Show end");
	}

	public static void main(String[] args) 
	{
		    System.out.println("Main start");
		    show();
		    System.out.println("Main end");
	}

}