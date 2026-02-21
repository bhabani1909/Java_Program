class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
    A()
    {
    	System.out.println("AC");
    }
	
}
class B extends A
{
	B(int x,int y)
	{
             //super();
         System.out.println("parameter BC "+y);
	}
	B()
	{
		System.out.println("BC");
	}
}
class Q18
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B(10,20);
	}
}