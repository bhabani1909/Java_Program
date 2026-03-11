abstract class A
{
    abstract void show();
}
class Q9
{
    public static void main(String arg[])
    {
       A ob=new A()
       {
             void show()
             {
                System.out.println("show override");
             }

       };
       ob.show();
    }
}