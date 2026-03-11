interface Arith
{
    abstract int add(int x,int y);
}

class Q17
{
    public static void main(String arg[])
    {
       Arith a=(x,y)->x+y;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}