public class Q21 
{

	public static void main(String[] args) 
	{
			String s="ram";
			try
			{
				System.out.println(s.charAt(4));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}

	}

}