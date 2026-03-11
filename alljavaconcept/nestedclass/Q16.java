interface Arith
{
    abstract int add(int x,int y);
}

class Q16
{
    public static void main(String arg[])
    {
       Arith a=new Arith()
       {

            public int add(int x,int y)
            {
                return x+y;
            }
       };
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}