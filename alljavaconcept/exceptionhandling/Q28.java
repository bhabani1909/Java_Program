class A
{
	static
	{
		System.out.println("Static block A");
	}
}
public class Q28
{
	static void show() throws ClassNotFoundException
	{
		System.out.println("Show start");
		Class.forName("A");
		System.out.println("Show end");
	}

	public static void main(String[] args) throws  ClassNotFoundException
	{
		    System.out.println("Main start");
		    show();
		    System.out.println("Main end");
	}

}