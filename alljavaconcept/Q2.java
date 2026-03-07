package pk;
class MyArith
{
	
	void add(int a,int b)
	{
		System.out.println("Sum 2 I = "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Sum 3 I = "+(a+b+c));
	}
	void add(double a,double b) 
	{
		System.out.println("Sum 2 R = "+(a+b));
	}
	void add(double a,int b)
	{
		System.out.println("Sum 2 IR = "+(a+b));
	}
}
public class MyTest 
{

	public static void main(String[] args) 
	{
		MyArith m =new MyArith();
		m.add(10,20);
		m.add(2.5,13);

	}

}
