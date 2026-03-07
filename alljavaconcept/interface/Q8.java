interface A
{
	void f1();
	void f2();
	int f3();
}

abstract class B implements A  // B is known as adaapter class
{
	public void f1(){ }
	public void f2(){ }
	public int f3(){ return 0; }
}
class C extends B
{
      public void f2(){ 
      	System.out.println("f2 method ");
      }
}


class Q8
{
	public static void main(String arg[])
	{
         A ob=new C();
         ob.f2();
	}
}