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








package pk;

public class P 
{
	void f1()
	{
		System.out.println("f1 method");
	}

}

package pk;

public class C extends P 
{
	void f2()
	{
		System.out.println("f2 method");
	}

}

package pk;

public class SingleInheritance
{

	public static void main(String[] args) 
	{
		C ob=new C();
		ob.f1();
		ob.f2();

	}

}







package pk;
class P
{
	int x;  //instance variable
}
class C extends P 
{
	int y;
}
public class SingleInheritance
{

	public static void main(String[] args) 
	{
		C ob=new C();
		System.out.println(ob.x);
		System.out.println(ob.y);
        ob.x=10;
		ob.y=20;
		System.out.println(ob.x);
		System.out.println(ob.y);
	}

}








package pk;
class P
{
	private int x;  //instance variable
	void show()
	{
		System.out.println("x value = "+x);
	}
	void initp()
	{
		x=10;
	}
}
class C extends P
{
	private int y;
	void disp()
	{
		System.out.println("y value = "+y);
	}
	void initc()
	{
		y=20;
	}
}
public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		C ob=new C();
		//System.out.println(ob.x);
		ob.show();
		//System.out.println(ob.y);
		ob.disp();
		//ob.x=10;
		ob.initp();
		//ob.y=20;
		ob.initc();
		ob.show();
		ob.disp();
		

	}

}








package pk;
class P
{
	private int x;  //instance variable
	void show()
	{
		System.out.println("x value = "+x);
	}
	P()
	{
		x=10;
	}

}
class C extends P
{
	private int y;
	void disp()
	{
		System.out.println("y value = "+y);
	}
	C()
	{
		super();//it call P() constructor
		y=20;
	}
}

public class Singleinheritance 
{

	public static void main(String[] args)
	{
		C ob=new C();
		ob.show();
		ob.disp();

	}

}

