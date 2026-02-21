class A
{
	static int x;
	int y;
	{
       System.out.println("non static block A "+y);
	}
	static
	{
	    System.out.println("static block A "+x);
	}
	A()
	{
	    System.out.println("A constructor ");
	}
}
class B extends A
{
	static int p;
	int q;
	{
       System.out.println("non static block B "+q);
	}
	static
	{
	    System.out.println("static block B "+p);
	}
	B()
	{
	    System.out.println("B constructor ");
	}
}
class Q29
{
	public static void main(String arg[])
	{
	     B ob=new B();
	}
}