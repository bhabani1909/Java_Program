abstract class A
{
	abstract void show();
}
public class Q7 
{

	public static void main(String[] args)
	{
		A ob=new A()
				{
			       void show()
			       {
			    	   System.out.println("Show Method");
			       }
			     
				};
		ob.show();
	}	

}