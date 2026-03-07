interface A
{
	void show(); //publlic abstract void show();

}
class B implements A
{
    public  void show()
    {
    	System.out.println("show method ");
    }
   
}
class Q1
{
	public static void main(String arg[])
	{
		//A ob=new A();  error
		A ob=new B();
		ob.show();
	}
}