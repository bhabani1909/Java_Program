interface A
{
	void show(); //publlic abstract void show();
  
}
interface B
{
	void look();
}
class C
{
	void disp()
	{
		System.out.println("disp method ");
	}
	
}
class D  extends C  implements A,B
{
    public  void show()
    {
    	System.out.println("show method ");
    }
   
     public  void look()
    {
    	System.out.println("look method ");
    }
   
}
class Q7
{
	public static void main(String arg[])
	{
		C ob=new D();
		//ob.show();
		ob.disp();
		//ob.look();
		
	}
}