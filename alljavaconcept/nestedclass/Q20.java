interface Arith
{
    abstract int add(int x,int y);
}
class B
{
    static int f1(int x,int y)
    {
        return x+y;
    }
}
class Q20
{
    public static void main(String arg[])
    {
       Arith a=B::f1;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}