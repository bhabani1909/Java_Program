class A
{
	void show()
	{
		
	}
}
public class Q18 
{

	public static void main(String[] args) 
	{
			int arr[];
			try
			{
				arr=new int[-3];
			}
			catch(NegativeArraySizeException e)
			{
				System.out.println(e);
			}
			System.out.println("End");
	}

}