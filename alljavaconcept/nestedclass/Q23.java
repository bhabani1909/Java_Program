interface A
{
    abstract void show();
}
class B
{
    B()
    {
        System.out.println("hi");
    }
}
class Q23
{
    public static void main(String arg[])
    {
    
        A ob=B::new;
        ob.show();
    }
}