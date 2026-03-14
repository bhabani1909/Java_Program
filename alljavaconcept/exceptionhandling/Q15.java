class A
{
	void show()
	{
		
	}
}
public class Q15 
{

	public static void main(String[] args) 
	{
			String s="123";
			int no;
			try
			{
				no=Integer.parseInt(s);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}