class A
{
	int x=10;
	static int y=20;
	class B
	{
		void show()
		{
			System.out.println(x+" "+y);
		}
	}
}
public class Q1 
{

	public static void main(String[] args)
	{
		A ob=new A();
		A.B obj=ob.new B();
		obj.show();

	}

}