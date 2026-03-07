interface MyInterface {
    default void greet() {
        System.out.println("Hello from MyInterface");
    }
}

class MyClass implements MyInterface {
    // No need to override greet() unless customization is needed
}

public class Q9 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();  // Output: Hello from MyInterface
    }
}