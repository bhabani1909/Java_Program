interface A
{
	void show(); //publlic abstract void show();
   
}
interface B
{
	void disp();
}
class C implements A,B
{
    public  void show()
    {
    	System.out.println("show method ");
    }
    public  void disp()
    {
    	System.out.println("disp method ");
    }
   
}
class Q3
{
	public static void main(String arg[])
	{
		A ob=new C();
		ob.show();
		//ob.disp(); error
		B obj=new C();
		obj.disp();
		//obj.show();// error
	C obj1=new C();
	obj1.show();
	obj1.disp();
	}
}