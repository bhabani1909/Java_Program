class Employee
{
	String name;
	int pcno;
	int age;
	int height;
	String colour;
}
class Q1
{
	public static void main(String args[])
	{
	  Employee e1=new Employee();
	  e1.name="Bhabani";
	  e1.pcno=24;
	  e1.age=19;
	  e1.height=163;
      e1.colour="brown";
      System.out.println("1st Employee name is "+e1.name);
      System.out.println("PC Number is "+e1.pcno);
      System.out.println("Age is "+e1.age);
      System.out.println("Height is "+e1.height);
      System.out.println("Skin tone is "+e1.colour);
	}
}