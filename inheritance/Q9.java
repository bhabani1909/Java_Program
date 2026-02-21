class A {
    void showA() { System.out.println("A class"); }
}

class B extends A {
    void showB() { System.out.println("B class"); }
}

class C extends A {
    void showC() { System.out.println("C class"); }
}

class Q9
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.showA();
	    ob.showB();
	      C obj=new C();
	    obj.showA();
	    obj.showC();
	}
}