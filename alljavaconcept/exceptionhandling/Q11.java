public class Q11 
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			try
			{
				System.out.println(10/0);
			}
			catch(RuntimeException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}