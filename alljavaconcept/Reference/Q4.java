class Test
{
	static int a;
	int b;
	void values(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		System.out.println(a+b);
	}
	void mult()
	{
		System.out.println(a*b);
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.values(1,2);
		t.add();
		t.mult();

	}

}