interface A
{
	void show(); //publlic abstract void show();
  
}
interface B extends A
{
	void disp();
	
}
class C implements B
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
class Q5
{
	public static void main(String arg[])
	{
		B ob=new C();
		ob.show();
		ob.disp();
		
	}
}