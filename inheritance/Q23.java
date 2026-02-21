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
class Q23
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}