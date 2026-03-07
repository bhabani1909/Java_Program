//Method overriding
package pk;
class P
{
	void marry()
	{
		System.out.println("Mita");
	}
	void property()
	{
		System.out.println("Money+land+car");
	}
}
class C extends P
{
	void marry()
	{
		System.out.println("Sita");
	}
}
public class MyTest 
{

	public static void main(String[] args) 
	{
		C ob=new C();
		ob.marry();
		ob.property();
	}

}

