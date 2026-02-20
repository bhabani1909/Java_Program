package pk;
class P //parent,base,super class
{
	void f1()
	{
		System.out.println("f1 method");
	}
}
class C extends P //child,derive,sub class
{
	void f2()
	{
		System.out.println("f2 method");
	}
}
//driver class
public class SingleInheritance1 
{

	public static void main(String[] args) 
	{
		P ob=new P();
		ob.f1();
		//ob.f2();
		C obj=new C();
		obj.f1();
		obj.f2();
	}

}
