public class Q2
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    Q2 t=new Q2();
	}
	{
	    System.out.println("Nonstatic block test");
	}
}