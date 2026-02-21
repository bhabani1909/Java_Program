//Inheritance constructor

package pk;
class P
{
	P(int x)
	{
		System.out.println("P pC");
	}
	P()
	{
		System.out.println("P zC");
	}
}
class C extends P
{
	C()
	{
		System.out.println("C zC");
	}
	C(int x,int y)
	{
		super(x);
		System.out.println("C pC");
	}
}

public class Test
{

	public static void main(String[] args)
	{
		C ob=new C();
		C obj=new C(10,20);
	}

}

o/p:-
P zC
C zC
P pC
C pC











//Inheritance Static NonStatic constructor order
package pk;
class P
{
	static int x; //1
	P() //7 //13
	{
		System.out.println("P zC");
	}
	int y; //5 //11
	static //2
	{
		System.out.println("static block P");
	}
	{//6 //12
		System.out.println("nonstatic block P");
	}
}
class C extends P
{
	C() //10 //16
	{
		System.out.println("C zC");
	}
	static int a; //3
	int b; //8 //14
	static //4
	{
		System.out.println("static block C");
	}
	{ //9 //15
		System.out.println("nonstatic block C");
	}
}

public class Test
{

	public static void main(String[] args) 
	{
		C ob=new C();
		C obj=new C();
	}

}

o/p:-
static block P
static block C
nonstatic block P
P zC
nonstatic block C
C zC
nonstatic block P
P zC
nonstatic block C
C zC
