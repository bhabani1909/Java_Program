interface A
{
	void show(); //By default public abstract
}
interface X
{
	void look();
}
interface B extends A,X
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
	public void look()
	{
		System.out.println("Look method");
	}
}
public class Q16
{
	
	public static void main(String[] args) 
	{
		B obj=new C();
		obj.show();
		obj.disp();
		obj.look();
		
	}

}