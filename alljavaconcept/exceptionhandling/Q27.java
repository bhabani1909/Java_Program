public class Q27
{
	public static void main(String args[])
	{
	    try
	    {
	        System.out.println(10/0);
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	    finally
	    {
	        System.out.println("Must Execute");
	    }
	    System.out.println("Main End");
	}
}