class A
{
	int x;
	A()
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
	B()
	{
		  //by default super()  it call parent class zero argumnet constructor 
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Q12
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.look();
	}
}