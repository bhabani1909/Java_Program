class A
{
	int x=10;
	static int y=20;
	static class B
	{
		void show()
		{
			//System.out.println(x);error
			System.out.println(y);
		}
	}
}
public class Q5 
{

	public static void main(String[] args)
	{
		A.B ob=new A.B();
		ob.show();
	}

}