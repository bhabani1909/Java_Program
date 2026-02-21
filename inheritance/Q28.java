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
class Q28
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.show();
	}
		
}