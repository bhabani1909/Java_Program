class A
{
	void show()
	{
		
	}
}
public class Q20 
{

	public static void main(String[] args) 
	{
			int arr[]= {10,20,30};
			try
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("End");
	}

}