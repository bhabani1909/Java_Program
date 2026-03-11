interface Arith
{
    abstract int add(int x,int y);
}
class B
{
     int f1(int x,int y)
    {
        return x+y;
    }
}
class Q21
{
    public static void main(String arg[])
    {
        B ob=new B();
       Arith a=ob::f1;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}