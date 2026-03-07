
class Complex
{
	int r,i; //instance variable
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
}
class ComplexTest
{
	public static void main(String args[])
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(4,5);
		//Complex c3=c1+c2; error
		Complex c3=new Complex();
		c3.r=c1.r+c2.r;
		c3.i=c1.i+c2.i;
		c1.show();
		c2.show();
		c3.show();
	}
}