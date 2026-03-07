interface A
{
	int x=10;// By default public static final
}
public class Test
{
	
	public static void main(String[] args) 
	{
		System.out.println(A.x);
	}

}





interface A
{
	int x=10; // By default public static final
	void show(); //By default public abstract
}
class B implements A
{
	public void show()
	{
		System.out.println("Show method");
	}
}
public class Test
{
	
	public static void main(String[] args) 
	{
		A ob=new B();
		System.out.println(ob.x);
	}

}








interface A
{
	void show(); //By default public abstract
}
interface B
{
	void disp(); ////By default public abstract
}
class C implements A,B
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void disp()
	{
		System.out.println("Disp method");
	}
}
public class Test
{
	
	public static void main(String[] args) 
	{
		A ob=new C();
		ob.show();
		B obj=new C();
		obj.disp();
		C obje=new C();
		obje.show();
		obje.disp();
	}

}







interface A
{
	void show(); //By default public abstract
}
interface B extends A
{
	void disp(); ////By default public abstract
}
class C implements B
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void disp()
	{
		System.out.println("Disp method");
	}
}
public class Test
{
	
	public static void main(String[] args) 
	{
		B obj=new C();
		obj.show();
		obj.disp();
		
	}

}







interface A
{
	void show(); //By default public abstract
}
interface X
{
	void look();
}
interface B extends A,X
{
	void disp(); ////By default public abstract
}
class C implements B
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void disp()
	{
		System.out.println("Disp method");
	}
	public void look()
	{
		System.out.println("Look method");
	}
}
public class Test
{
	
	public static void main(String[] args) 
	{
		B obj=new C();
		obj.show();
		obj.disp();
		obj.look();
		
	}

}
