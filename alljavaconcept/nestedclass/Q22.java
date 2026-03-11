interface A
{
    abstract void show();
}
class B
{
     void disp()
    {
        System.out.println("hi");
    }
}
class Q22
{
    public static void main(String arg[])
    {
        B obj=new B();
        A ob=obj::disp;
        ob.show();
    }
}