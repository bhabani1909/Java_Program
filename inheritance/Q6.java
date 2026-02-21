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

public class Q6
{

	public static void main(String[] args) 
	{
		C ob=new C();
		C obj=new C();
	}

}