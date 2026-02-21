class A
 {
    void showA() 
    {
     System.out.println("A class"); 
     }
}

class B extends A
 {
    void showB()
     { 
    System.out.println("B class"); 
    }
}
class Q7
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.showA();
	    ob.showB();
	    A obj=new A();
	    obj.showA();
	   // obj.showB(); error
	}
}