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
class Q25
{
	public static void main(String arg[])
	{
		B ob=new B();
		//System.out.println(ob.x); child x 20
		ob.show();
	}
		
}