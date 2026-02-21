class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
	
}
class B extends A
{
	B(int x,int y)
	{
           super(x);
         System.out.println("parameter BC "+y);
	}
}
class Q17
{
	public static void main(String arg[])
	{
		B ob=new B(10,20);
	}
}