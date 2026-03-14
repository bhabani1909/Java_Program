class A
{
	void show()
	{
		
	}
}
public class Q14 
{

	public static void main(String[] args) 
	{
			System.out.println("A");
			A ob=null;
			try
			{
				ob.show();
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("B");
	}

}