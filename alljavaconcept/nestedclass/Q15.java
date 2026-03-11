interface Arith
{
    abstract int add(int x,int y);
}
class B implements Arith
{
    public int add(int x,int y)
            {
                return x+y;
            }
}
class Q15
{
    public static void main(String arg[])
    {
       Arith a=new B();
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}