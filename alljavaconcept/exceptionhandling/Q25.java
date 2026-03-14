public class Q25
{

	public static void main(String[] args) 
	{
			int arr[]= null;
			try
			{
				System.out.println(arr[2]/2);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Hi"+e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Bye"+e);
			}
			catch(Exception e)
			{
				System.out.println("Last End"+e);
			}
			System.out.println("Main End");

	}

}