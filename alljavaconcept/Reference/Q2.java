class Test
{
	int a=10;
	int b=20;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.add(1,2);
	}
}