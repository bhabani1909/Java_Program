interface A
{
	void show();
}
public class Q8 
{

	public static void main(String[] args)
	{
		A ob=new A()
				{
			       public void show()
			       {
			    	   System.out.println("Show Method");
			       }
			     
				};
		ob.show();
	}	

}