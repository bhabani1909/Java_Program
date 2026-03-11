interface Arith
{
    abstract void add(int x,int y);
}
class B
{
    B(int x,int y)
    {
           System.out.println(x+y);
    }
}
class Q24
{
    public static void main(String arg[])
    {
       Arith ob=B::new;
       ob.add(10,20);

    }
}