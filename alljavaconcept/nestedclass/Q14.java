interface A
{
    abstract void show();
}
class B
{
    void disp(A x)
    {
        x.show();
    }
}
class Q14
{
    public static void main(String arg[])
    {
       
       B obj=new B();
       obj.disp(

        new A()
       {
            public void show()
             {
                System.out.println("show override");
             }

       });
    }
}