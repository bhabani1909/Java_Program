class A
{
	void show()
	{
		
	}
}
public class Q16 
{

	public static void main(String[] args) 
	{
			String s="Hi";
			int no;
			try
			{
				no=Integer.parseInt(s);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}