reuseablity :
Definition: Reusability means reusing the existing code or class into another class to reduce redundancy and increase efficiency.
There are two main ways to achieve reusability in Java:
one class  use another class 




1."Is-a" Relationship (Inheritance)
Concept: One class is a specialized version of another.

Achieved using: extends keyword.

Example:

A Student is a Person.


is a (inhertiance)

    Student is a Person
 class Person
 {
    _____
 }
 class Student  extends Person
 {

 }

2. "Has-a" Relationship (Containership / Composition)
Concept: One class contains another class as a field.

Achieved using: Object creation inside a class.

Example:

A Car has an Engine.
class Engine
{
	
}
class Car
{
	Engiene e=new Engiene
}



Inheritance:
🔹 Definition:
Inheritance is a mechanism in which one class (child class) acquires the properties and behaviors (fields and methods) of another class (parent class).
or
To create new class from existing class or userdefined class.

Purpose: Code reusability and method overriding (polymorphism).

Child class (subclass): The class that inherits.

Parent class (superclass): The class that is inherited from.


new class is known as child/sub/derive class
existing  is known    as parent/super/base class

class Parentclassname
{
	
}
class Childclassname extends Parentclassname
{
	
}

types of inheritance
____________________
java supports only Single, Multilevel, and Hierarchical inheritance via classes.
Multiple inheritance is not supported with classes due to ambiguity (but can be achieved using interfaces).



Inheritance Type	Supported in Java	Example Structure
Single	               ✅ Yes	              A → B
Multilevel	           ✅ Yes	            A → B → C
Hierarchical	       ✅ Yes	          A → B, A → C
Multiple (via class)	❌ No	A, B → C (Not allowed)
Multiple (via interface)	✅ Yes	interface A, B → class C
Hybrid	✅ With interfaces	   Combination of the above




single inheritance:
___________________-One child inherits from one parent.
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
class Test
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




Multilevel Inheritance
:
Child inherits from a parent, and that parent is itself a child of another class.


class A {
    void showA() { System.out.println("A class"); }
}

class B extends A {
    void showB() { System.out.println("B class"); }
}

class C extends B {
    void showC() { System.out.println("C class"); }
}

class Test
{
	public static void main(String arg[])
	{
	    C ob=new C();
	    ob.showA();
	    ob.showB();
	    ob.showC();
	}
}


Hierarchical Inheritance
Multiple child classes inherit from a single parent class.


class A {
    void showA() { System.out.println("A class"); }
}

class B extends A {
    void showB() { System.out.println("B class"); }
}

class C extends A {
    void showC() { System.out.println("C class"); }
}

class Test
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



4. Multiple Inheritance (Not Supported via Classes)


class A { void show() {} }
class B { void show() {} }
class C extends A, B { } // ❌ Not allowed in Java
Reason: Diamond Problem (ambiguity in method resolution).



Solution: Use Interfaces.

interface A { void show(); }
interface B { void show(); }

class C implements A, B {
    public void show() {
        System.out.println("Show from C");
    }
}




single inhertiance
________________________
class A
{
	int x;
	void setA()
	{
          x=10;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	void setB()
	{
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.setA();
		ob.setB();
		ob.disp();
		ob.look();
	}
}

o/p;
x value=10
y value=20

class A
{
	int x;
	void setA()
	{
          x=10;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	void setB()
	{
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.look();
	}
}

x value=0
y value=0

here setA() and setB() defined not calling   
problem not initlization   to solve using constructor


class A
{
	int x;
	A()
	{
          x=10;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	B()
	{
		  //by default super()  it call parent class zero argumnet constructor 
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.look();
	}
}


o/p:
x value=10
y value=20



constructor in inheritance
______________________________

class A 
{

	A()
	{

         System.out.println("AC");
	}
	
}
class B extends A
{
	
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
	}
}

o/p:
AC
 Explanation:
When you create an object of class B, the constructor of B is called.

Since B does not define its own constructor, the default constructor is automatically provided by the compiler.

This default constructor will implicitly call the parent constructor A() using super().

So, the constructor of class A gets executed and prints "AC





class B extends A {
    B() {
        super(); // Automatically inserted by compiler
    }
}



Constructors are not inherited, but they are called during object creation.


The parent constructor is always called first, either explicitly using super() or implicitly.

If the parent class doesn't have a no-arg constructor, then the child class must call a matching constructor using super(arguments).



class A 
{

	A()
	{

         System.out.println("AC");
	}
	
}
class B extends A
{
	B()
	{

         System.out.println("BC");
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
AC
BC


Explanation:
When new B() is called:

Java first calls the constructor of the parent class A() using super().

This happens automatically as the first statement in B() if not written explicitly.

Then it executes the body of B() constructor.



Internally, this is happening:

class B extends A {
    B() {
        super(); // inserted automatically by the compiler
        System.out.println("BC");
    }
}

 Key Points to Remember:
Constructors in Java are executed top-down, starting from the parent class to the child class.

The super() call must be the first line in the child constructor.

If not written explicitly, the compiler adds super(); if the parent has a no-arg constructor.


class A 
{

	
}
class B extends A
{
	B()
	{

         System.out.println("BC");
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
BC

Since class A does not have a user-defined constructor, the compiler automatically adds a default constructor:


A() { super(); }
Class B has its own constructor. Inside that constructor:

super(); is implicitly called to invoke the default constructor of class A.

Since A has a default constructor (implicit), this works fine.

Then "BC" is printed.




 Internally, the flow is like this:

class B extends A {
    B() {
        super(); // automatically inserted
        System.out.println("BC");
    }
}




class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor "+x);
    }
	
}
class B extends A
{
	B()
	{
           //super() by default it call zero argumnet constructor parameter
         System.out.println("BC");
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
error
Test.java:12: error: constructor A in class A cannot be applied to given types;
        {
        ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error



class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
	
}
class B extends A
{
	B()
	{
           super(10);
         System.out.println("BC");
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
parameter constructor AC   10
BC




class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
	
}
class B extends A
{
	B(int x,int y)
	{
           super(x);
         System.out.println("parameter BC "+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B(10,20);
	}
}

o/p:
parameter constructor AC  10
parameter BC 20




class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
	
}
class B extends A
{
	B(int x,int y)
	{
           super(x);
         System.out.println("parameter BC "+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B(); // erorr

	}
}


o/p:
Test.java:21: error: constructor B in class B cannot be applied to given types;
                B ob=new B();
                     ^
  required: int,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error



class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
    A()
    {
    	System.out.println("AC");
    }
	
}
class B extends A
{
	B(int x,int y)
	{
             //super();
         System.out.println("parameter BC "+y);
	}
	B()
	{
		System.out.println("BC");
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B(10,20);
	}
}

o/p:
AC
BC
AC
parameter BC 20



class A 
{
    A(int x)
    {
    	System.out.println("parameter constructor AC  "+x);
    }
    A()
    {
    	System.out.println("AC");
    }
	
}
class B extends A
{
	B(int x,int y)
	{
             super(x);
         System.out.println("parameter BC "+y);
	}
	B()
	{
		System.out.println("BC");
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B(10,20);
	}
}

o/p:
AC
BC
parameter constructor AC  10
parameter BC 20






class A
{
	int x;
	A()
	{
          x=10;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	B()
	{
		  //by default super()  it call parent class zero argumnet constructor 
          y=20;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B();
		ob.disp();
		ob.look();
		obj.disp();
		obj.look();
	}
}



o/p:
x value=10
y value=20
x value=10
y value=20




class A
{
	int x;
	A()
	{
          x=10;
	}
	A(int x)
	{
		this.x=x;
	}
	void disp()
	{
		System.out.println("x value="+x);
	}
}
class B extends A
{
	int y;
	B()
	{
		  //by default super()  it call parent class zero argumnet constructor 
          y=20;
	}
	B(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void look()
	{
		System.out.println("y value="+y);
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		B obj=new B(30,40);
		ob.disp();
		ob.look();
		obj.disp();
		obj.look();
	}
}

o/p:
x value=10
y value=20
x value=30
y value=40




class A
{
	int x=10;
	
}
class B extends A
{
      int x=20;


}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		System.out.println(ob.x);
	}
		
}



o/p:
20



class A
{
	int x=10;
	
}
class B extends A
{
      int x=20;
    void  show()
      {
             System.out.println(x); // child x
      }


}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}


o/p:
20



class A
{
	int x=10;
	
}
class B extends A
{
      int x=20;
    void  show()
      {
             System.out.println(x); // child x
              System.out.println(super.x); // parent x
      }


}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}



o/p:
20
10


class A
{
	int x=10;
	
}
class B extends A
{
      int x=20;
    void  show()
      {
      	      int x=30;
             System.out.println(x); // local  x  30
             System.out.println(this.x); //child  instance x  20
              System.out.println(super.x); // parent x
      }


}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}


o/p:
30
20
10





class Person
{
	String n;
	int a;
	Person()
	{
	   n=" ";
	   a=0;
	}
	Person(String n,int a)
	{
        this.n=n;
        this.a=a;
	}
	void disp()
	{
		System.out.println("Name="+n);
		System.out.println("Age="+a);
	}
}
class Student extends Person
{
	int r;
	double m;
	Student()
	{
	     r=0;
	     m=0.0;
	}
	Student(String n,int a,int r,double m)
	{
		super(n,a);
		this.r=r;
		this.m=m;
	}
	void look()
	{
		System.out.println("Rollnumber="+r);
		System.out.println("Mark="+m);
	}
}
class Test
{
	public static void main(String arg[])
	{
		Student ob=new Student("Kuna",19,2,90.32);
		ob.disp();
		ob.look();
	}
}












class A
{
	int x=10;
	
}
class B extends A
{
      int x=20;
    void  show()
      {
      	      int x=30;
             System.out.println(x); // local  x  30
             System.out.println(this.x); //child  instance x  20
              System.out.println(super.x); // parent x
      }


}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}

What is super in Java?
super is a special keyword in Java used to refer to the immediate parent class of the current class.

It allows a child (subclass) to access members (variables, methods, and constructors) of its parent (superclass).

✅ Use Cases of super in Java
Usage	Purpose	Example
super.variable	Access parent class variable	super.x
super.method()	Call parent class method	super.display()
super()	Call parent class constructor (must be first line)	super();
super(args)	Call parent class parameter constructor (must be first line)	super();





class A
{
	void show()
	{
		System.out.println("A show ");
	}
	
}
class B extends A
{
   
       void show()
	{
		System.out.println("B show ");
		super.show();
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
B show
A show