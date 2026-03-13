public class Q2 
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			System.out.println("B");
			try 
			{
				System.out.println(10/0);
				System.out.println("Try block end");
			}
			catch(Exception e)
			{
				System.out.println("Exception caught "+e);
			}
			System.out.println("C");
			System.out.println("D");
		
	}

}