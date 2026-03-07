public class A
{
	static
	{
	    System.out.println("Static block test");
	}
	A()
	{
	    System.out.println("Test constructor");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A t=new A();
	}
	{
	    System.out.println("Nonstatic block test");
	}
}