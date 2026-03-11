abstract class A
{
    abstract void show();
    
}
class Q10
{
    public static void main(String arg[])
    {
      new A()
       {
             void show()
             {
                System.out.println("show override");
             }
             
       }.show();
    }
}