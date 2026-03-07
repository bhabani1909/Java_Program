interface A
{
	void show(); //publlic abstract void show();
  
}
interface B
{
	void look();
}
interface C extends A,B
{
	void disp();
	
}
class D implements C
{
    public  void show()
    {
    	System.out.println("show method ");
    }
     public  void disp()
    {
    	System.out.println("disp method ");
    }
     public  void look()
    {
    	System.out.println("look method ");
    }
   
}
class Q6
{
	public static void main(String arg[])
	{
		C ob=new D();
		ob.show();
		ob.disp();
		ob.look();
		
	}
}