package pk;
class MyArith
{
	MyArith()
	{
		System.out.println("Zero argument constructor");
	}

	MyArith(int i, int j) 
	{
		System.out.println("Para constructor "+i+" "+j);
	}
	
	MyArith(int x,int y,int z)
	{
		System.out.println("Para constructor "+x+" "+y+" "+z);
	}
}	
public class MyTest 
{

	public static void main(String[] args) 
	{
		MyArith m1 =new MyArith(10,20);
		MyArith m2 =new MyArith(10,20,30);
		MyArith m3 =new MyArith();
		

	}

}
