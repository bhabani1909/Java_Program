class P
{
	private int x;  //instance variable
	void show()
	{
		System.out.println("x value = "+x);
	}
	P()
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
	C()
	{
		super();//it call P() constructor
		y=20;
	}
}

public class Q4
{

	public static void main(String[] args)
	{
		C ob=new C();
		ob.show();
		ob.disp();

	}

}