class A
{

	private int x;  //
	int y;  //   default
	protected int z;
}
class B extends A
{
	void show()
	{
		 // System.out.println(x);  error
		  System.out.println(y);
		  System.out.println(z);
	}

}
class Q31
{
	public static void main(String arg[])
	{
	     B ob=new B();
	     ob.show();
	}
}