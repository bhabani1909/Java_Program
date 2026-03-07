interface A
{
	void show(); //By default public abstract
}
interface B extends A
{
	void disp(); ////By default public abstract
}
class C implements B
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void disp()
	{
		System.out.println("Disp method");
	}
}
public class Q15
{
	
	public static void main(String[] args) 
	{
		B obj=new C();
		obj.show();
		obj.disp();
		
	}

}