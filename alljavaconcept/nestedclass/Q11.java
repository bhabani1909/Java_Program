interface A
{
    abstract void show();
}
class Q11
{
    public static void main(String arg[])
    {
       A ob=new A()
       {
             public void show()
             {
                System.out.println("show override");
             }

       };
       ob.show();
    }
}