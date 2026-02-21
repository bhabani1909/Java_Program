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
class Q26
{
	public static void main(String arg[])
	{
		Student ob=new Student("Kuna",19,2,90.32);
		ob.disp();
		ob.look();
	}
}