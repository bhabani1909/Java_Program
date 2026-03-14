public class Q24
{

	public static void main(String[] args) 
	{
			int arr[]= {10,20,30,40};
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
			System.out.println("Main End");

	}

}