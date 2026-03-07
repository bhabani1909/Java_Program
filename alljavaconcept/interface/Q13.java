interface A
{
	int x=10; // By default public static final
	void show(); //By default public abstract
}
class B implements A
{
	public void show()
	{
		System.out.println("Show method");
	}
}
public class Q13
{
	
	public static void main(String[] args) 
	{
		A ob=new B();
		System.out.println(ob.x);
	}

}