package interfaces;

@FunctionalInterface
interface A {
    void show(int i);
}

class B implements A {
    public void show(int i) {
        System.out.println("From b " + i);
    }
}

public class FunctionalDemo {
   public static void main(String[] args) {
        A obj = new B();
        obj.show(2);
        A obj1 = new A() {
            public void show(int i) {
                System.out.println("from anonymous " + i);
            }
        };
        obj1.show(4);


        A obj2 = i -> System.out.println("Lambda expression " + i);
        obj2.show(6);
   }
}
