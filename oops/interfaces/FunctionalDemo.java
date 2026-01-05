package interfaces;

@FunctionalInterface
interface A {
    void show(int i);
}

interface B {
    int print(int i, int j);
}

class C implements A {
    public void show(int i) {
        System.out.println("From b " + i);
    }
}

class D implements B {
    public int print(int i, int j) {
        return i+j;
    }
}

public class FunctionalDemo {
   public static void main(String[] args) {
        // Normal way
        A obj = new C();
        obj.show(2);

        B obj3 = new D();
        System.out.println(obj3.print(4, 5));

        // Anonymous class
        A obj1 = new A() {
            public void show(int i) {
                System.out.println("from anonymous " + i);
            }
        };
        obj1.show(4);

        B obj4 = new B() {
            public int print(int i, int j) {
                return i + j;
            }
        };
        System.out.println(obj4.print(4, 10));

        // Lambda expression
        A obj2 = i -> System.out.println("Lambda expression " + i);
        obj2.show(6);

        B obj5 = (i, j) -> i+j;
        System.out.println(obj5.print(5, 6));


   }
}
