

class A {
    public void show() throws ClassNotFoundException {
       Class.forName("Test");
    }
}

class B {
    public void show() throws ClassNotFoundException {
        Class.forName("Test");
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

       try {
        Class.forName("test");
        obj1.show();
        obj2.show();
       }
       catch (Exception e) {
        System.out.println("Excption found");
       }
       
    }
}
