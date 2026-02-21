this 
this()
this(args)
super
super()
super(args)



this and super keyword not worjing directly inside static method

class A
{
    int x=10;
    int y=20;
    static void show()
    {
       // System.out.println(this); error
       // System.out.println(super);  error
    }
	public static void main(String arg[])
	{
	  A ob=new A();
      A.show();
	}
}

how to acess ob refrence variable data inside show method
passing object refence in argumnet.
class A
{
    int x=10;
    int y=20;
   void show()
    {
       System.out.println(x); 
       System.out.println(y); 
    }
	public static void main(String arg[])
	{
	  A ob=new A();
      show(ob);
	}
}

o/p:
10 20



static and non static block variable  in inheritance
____________________________________________________

class A
{
	static int x;
	int y;
	{
       System.out.println("non static block A "+y);
	}
	static
	{
	    System.out.println("static block A "+x);
	}
	A()
	{
	    System.out.println("A constructor ");
	}
}
class B extends A
{
	static int p;
	int q;
	{
       System.out.println("non static block B "+q);
	}
	static
	{
	    System.out.println("static block B "+p);
	}
	B()
	{
	    System.out.println("B constructor ");
	}
}
class Test
{
	public static void main(String arg[])
	{
	     B ob=new B();
	}
}



o/p:
static block A 0
static block B 0
non static block A 0
A constructor
non static block B 0
B constructor

Java Execution Flow
When JVM loads class Test, it loads B since it is referenced inside main().

Since B extends A, JVM will load A first, then B.

With the correction, here is the execution sequence:

Step-by-step execution:
Class A is loaded:

static block A 0 → x is 0 by default

Class B is loaded:

static block B 0 → p is 0 by default

Now object of B is created → new B()

Class A's constructor must run before B's

Memory allocated for object of B

Non-static block of A runs: non static block A 0 (y is 0 by default)

Constructor of A runs: A constructor

Now back to class B:

Non-static block of B runs: non static block B 0 (q is 0 by default)

Constructor of B runs: B constructor




class A
{
	static int x;
	int y;
	{
       System.out.println("non static block A "+y);
	}
	static
	{
	    System.out.println("static block A "+x);
	}
	A()
	{
	    System.out.println("A constructor ");
	}
}
class B extends A
{
	static int p;
	int q;
	{
       System.out.println("non static block B "+q);
	}
	static
	{
	    System.out.println("static block B "+p);
	}
	B()
	{
	    System.out.println("B constructor ");
	}
}
class Test
{
	public static void main(String arg[])
	{
	     B ob=new B();
	     B obj=new B();
	}
}


o/p:
static block A 0
static block B 0
non static block A 0
A constructor
non static block B 0
B constructor
non static block A 0
A constructor
non static block B 0
B constructor


private data 
__________________
class A
{

	private int x;  //
	int y;  //   default
	protected int z;
}
class B extends A
{
	void show()
	{
		 // System.out.println(x);  error
		  System.out.println(y);
		  System.out.println(z);
	}

}
class Test
{
	public static void main(String arg[])
	{
	     B ob=new B();
	     ob.show();
	}
}








private data and method not inheritance 
that acess only own class 



class A
{

	private int x;  //
	int y;  //   default
	protected int z;
	private void disp()
	{
         System.out.println(x);
	}
	void look()
	{
		 disp();
	}
}
class B extends A
{
	void show()
	{
		 // System.out.println(x);
		  //disp(); error
		look();
		  System.out.println(y);
		  System.out.println(z);
	}
}
class Test
{
	public static void main(String arg[])
	{
	     B ob=new B();
	     ob.show();
	}
}

o/p:
0
0
0