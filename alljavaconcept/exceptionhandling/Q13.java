public class Q13 
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			String s=null;
			try
			{
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}