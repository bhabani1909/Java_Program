interface A
{
    abstract void show();
}

class Q18
{
    public static void main(String arg[])
    {
       A ob=()->System.out.println("hi");
       ob.show();
    }
}