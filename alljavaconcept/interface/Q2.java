interface A
{
   void show(); //publlic abstract void show();
   int x=10;  //public static final int x=10;
}
class B implements A
{
    public  void show()
    {
    	System.out.println("show method ");
    }
   
}
class Q2
{
	public static void main(String arg[])
	{
		//A ob=new A();  error
		A ob=new B();
		ob.show();
		System.out.println(A.x);
		System.out.println(B.x);
	}
}