interface A
{
	void show(); //By default public abstract
}
interface B
{
	void disp(); ////By default public abstract
}
class C implements A,B
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
public class Q14
{
	
	public static void main(String[] args) 
	{
		A ob=new C();
		ob.show();
		B obj=new C();
		obj.disp();
		C obje=new C();
		obje.show();
		obje.disp();
	}

}