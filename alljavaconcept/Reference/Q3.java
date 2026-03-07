class Test
{
	static int i;
	int j;
	void values(int a,int b)
	{
		i=a;
		j=b;
	}
	void add()
	{
		System.out.println(i+j);
	}
	void mult()
	{
		System.out.println(i*j);
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.values(1,2);
		t.add();
		t.mult();

	}

}