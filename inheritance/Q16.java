class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
	
}
class B extends A
{
	B()
	{
           super(10);
         System.out.println("BC");
	}
}
class Q16
{
	public static void main(String arg[])
	{
		B ob=new B();
	}
}