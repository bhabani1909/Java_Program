class A
{
	static
	{
		System.out.println("A static block");
	}
}
public class Q5 
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
			System.out.println("A");
			System.out.println("B");
			Class.forName("A");
			System.out.println("C");
			System.out.println("D");
		
	}

}