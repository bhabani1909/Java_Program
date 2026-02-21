class A
{

	private int x;  //
	int y;  //   default
	protected int z;
	private void disp()
	{
         System.out.println(x);
	}
	void look()
	{
		 disp();
	}
}
class B extends A
{
	void show()
	{
		 // System.out.println(x);
		  //disp(); error
		look();
		  System.out.println(y);
		  System.out.println(z);
	}
}
class Q32
{
	public static void main(String arg[])
	{
	     B ob=new B();
	     ob.show();
	}
}