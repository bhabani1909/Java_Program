class A
{
	int x;
	A()
	{
          x=10;
	}
	A(int x)
	{
		this.x=x;
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
	B(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Q21
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B(30,40);
		ob.disp();
		ob.look();
		obj.disp();
		obj.look();
	}
}