class P
{
	int x;  //instance variable
}
class C extends P 
{
	int y;
}
public class Q2
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