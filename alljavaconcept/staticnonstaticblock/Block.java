package proj2;

public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	}
	{
	    System.out.println("Nonstatic block test");
	}
}
o/p:-
Static block test
Main method




package proj2;

public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    Test t=new Test();
	}
	{
	    System.out.println("Nonstatic block test");
	}
}
o/p:-
Static block test
Main method
Nonstatic block test




package proj2;

public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	Test()
	{
	    System.out.println("Test constructor");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    Test t=new Test();
	}
	{
	    System.out.println("Nonstatic block test");
	}
}
o/p:-
Static block test
Main method
Nonstatic block test
Test constructor




package proj2;

public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	Test()
	{
	    System.out.println("Test constructor");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    Test t=new Test();
	    Test t1=new Test();
	}
	{
	    System.out.println("Nonstatic block test");
	}
}
o/p:-
Static block test
Main method
Nonstatic block test
Test constructor
Nonstatic block test
Test constructor




package proj2;
class A
{
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	}
	{
	    System.out.println("Nonstatic block test");
	}
}
o/p:-
Static block test
Main method




package proj2;
class A
{
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A ob=new A();
	}
}
o/p:-
Main method
Static block test
NonStatic block A
A constructor





package proj2;
class A
{
    static void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A.show();
	}
}
o/p:-
Static block test
Main method
Static block A
Show method





package proj2;
class A
{
    static void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A.show();
	    A.show();
	}
}
o/p:-
Static block test
Main method
Static block A
Show method
Show method




package proj2;
class A
{
    void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A ");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A ob=new A();
	    ob.show();
	}
}
o/p:-
Main method
Static block A
NonStatic block A
A constructor
Show method




package proj2;
class A
{
    void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A ");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A ob=new A();
	    ob.show();
	    ob.show();
	}
}
o/p:-
Main method
Static block A
NonStatic block A
A constructor
Show method
Show method




package proj2;
class A
{
    void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A ");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A ob=new A();
	    ob.show();
	    A obj=new A();
	    obj.show();
	}
}
o/p:-
Static block test
Main method
Static block A
NonStatic block A
A constructor
Show method
NonStatic block A
A constructor
Show method





package proj2;
class A
{
    static int x=10;
    void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A");
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A ");
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    System.out.println(A.x);
	}
}
o/p:-
Static block test
Main method
Static block A10
10





package proj2;
class A
{
    void show()
    {
        System.out.println("Show method");
    }
	static
	{
	    System.out.println("Static block A1");
	}
	static int x=10;
	int y=20;
	static
	{
        System.out.println("Static block A2"+x);
	}
	A()
	{
	    System.out.println("A constructor");
	}
	{
	    System.out.println("NonStatic block A "+y);
	}
}
public class Test
{
	static
	{
	    System.out.println("Static block test");
	}
	public static void main(String[] args)
	{
	    System.out.println("Main method");
	    A ob=new A();
	}
}
o/p:-
Static block test
Main method
Static block A1
Static block A2 10
NonStatic block A 20
A constructor





package proj2;
public class Test
{
	int x;
	int y; //non static variable/member //object variable data //Instance variable
	public static void main(String[] args)
	{
	     Test t=new Test();
	     System.out.println(t.x+" "+t.y);
	     Test t1=new Test();
	     System.out.println(t1.x+" "+t1.y);
	     t.x=10;
	     t.y=20;
	     t1.x=30;
	     t1.y=40;
	     System.out.println(t.x+" "+t.y);
	     System.out.println(t1.x+" "+t1.y);

	}
}
o/p:-
0 0
0 0
10 20
30 40





package proj2;
public class Test
{
	int x;
	int y; //non static variable/member //object variable data //Instance variable
	static int z;
	public static void main(String[] args)
	{
	     System.out.println(z);
	} 
}
o/p:-
0





package proj2;
public class Test 
{
	int x;
	int y; //non static variable/member //object variable data //Instance variable
	static int z;
	public static void main(String[] args)
	{
		 System.out.println(z);
	     Test t=new Test();
	     System.out.println(t.x+" "+t.y+" "+t.z);
	     Test t1=new Test();
	     System.out.println(t1.x+" "+t1.y+" "+t1.z);
	     t.x=10;
	     t.y=20;
	     t1.x=30;
	     t1.y=40;
	     t.z=40;
	     t1.z=50;
	     System.out.println(t.x+" "+t.y+" "+t.z);
	     System.out.println(t1.x+" "+t1.y+" "+t1.z);

	}
}
o/p:-
0
0 0 0
0 0 0
10 20 50
30 40 50