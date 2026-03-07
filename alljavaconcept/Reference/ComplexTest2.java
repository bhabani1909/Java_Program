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
	Complex add(Complex c2) //void add(Complex final this,Complex c1,Complex c2)
	{
		Complex c3=new Complex();
		c3.r=this.r+c2.r; 
		c3.i=this.i+c2.i;
		return c3; 
	}
}
class ComplexTest2
{
	public static void main(String args[])
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(4,5);
		Complex c3=c1.add(c2);
		c1.show();
		c2.show();
		c3.show();
	}
}