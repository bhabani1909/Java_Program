class P
{
	private int x;  //instance variable
	void show()
	{
		System.out.println("x value = "+x);
	}
	void initp()
	{
		x=10;
	}
}
class C extends P
{
	private int y;
	void disp()
	{
		System.out.println("y value = "+y);
	}
	void initc()
	{
		y=20;
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
		C ob=new C();
		//System.out.println(ob.x);
		ob.show();
		//System.out.println(ob.y);
		ob.disp();
		//ob.x=10;
		ob.initp();
		//ob.y=20;
		ob.initc();
		ob.show();
		ob.disp();
		

	}

}