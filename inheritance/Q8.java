class A {
    void showA() { System.out.println("A class"); }
}

class B extends A {
    void showB() { System.out.println("B class"); }
}

class C extends B {
    void showC() { System.out.println("C class"); }
}

class Q8
{
	public static void main(String arg[])
	{
	    C ob=new C();
	    ob.showA();
	    ob.showB();
	    ob.showC();
	}
}