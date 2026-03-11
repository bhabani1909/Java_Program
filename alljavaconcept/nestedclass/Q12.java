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
class Q12
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
       B obj=new B();
       obj.disp(ob);
    }
}