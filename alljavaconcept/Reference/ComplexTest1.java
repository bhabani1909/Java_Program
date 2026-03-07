class Complex
{
	private int r,i; //instance variable
	Complex()
	{
		r=0;
		i=0;
	}
	Complex(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	void show()
	{
		System.out.println(this.r+"+"+this.i+"i");
	}
	void add(Complex c1,Complex c2) //void add(Complex final this,Complex c1,Complex c2)
	{
		this.r=c1.r+c2.r; //r=c1.r+c2.r
		this.i=c1.i+c2.i; //r=c1.i+c2.i
	}
}
class ComplexTest1
{
	public static void main(String args[])
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(4,5);
		//Complex c3=c1+c2; error
		Complex c3=new Complex();
		/*
		c3.r=c1.r+c2.r;     error
		c3.i=c1.i+c2.i;
		*/
		c3.add(c1,c2); //interanally c3.add(c3,c1,c2)
		c1.show();
		c2.show();
		c3.show();
	}
}