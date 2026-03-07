class Test
{
	int a=10;
	int b=20;
	void add(int i,int j)
	{
		System.out.println(a+b);
		System.out.println(i+j);
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.add(1,2);
	}
}