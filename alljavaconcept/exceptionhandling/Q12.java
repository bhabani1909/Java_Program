public class Q12
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			try
			{
				System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}