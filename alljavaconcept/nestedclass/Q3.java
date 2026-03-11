class A
{
	int x=10;
	static int y=20;
	class B
	{
		static int z=70;
		void show()
		{
			System.out.println(x+" "+y+" "+z);
		}
	}
}
public class Q3 
{

	public static void main(String[] args)
	{
		A ob=new A();
		A.B obj=ob.new B();
		obj.show();

	}

}