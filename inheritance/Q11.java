class A
{
	int x;
	void setA()
	{
          x=10;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	void setB()
	{
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Q11
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.look();
	}
}