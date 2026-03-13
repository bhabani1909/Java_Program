class A
{
	static
	{
		System.out.println("A static block");
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			System.out.println("B");
			try
			{
				Class.forName("B");
			} 
			catch (ClassNotFoundException e) 
			{	
				e.printStackTrace();
			}
			System.out.println("C");
			System.out.println("D");
		
	}

}