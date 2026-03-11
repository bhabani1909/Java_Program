interface A
{
    abstract void show();
}
class B
{
    static void disp()
    {
        System.out.println("hi");
    }
}
class Q19
{
    public static void main(String arg[])
    {
        A ob=B::disp;
        ob.show();
    }
}