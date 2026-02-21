class P
{
	P(int x)
	{
		System.out.println("P pC");
	}
	P()
	{
		System.out.println("P zC");
	}
}
class C extends P
{
	C()
	{
		System.out.println("C zC");
	}
	C(int x,int y)
	{
		super(x);
		System.out.println("C pC");
	}
}

public class Q5
{

	public static void main(String[] args)
	{
		C ob=new C();
		C obj=new C(10,20);
	}

}