class A {
  public void show1() {
    System.out.println("In A");
  }
}

class B extends A {
  public void show2() {
    System.out.println("In B");
  }
}
public class Casting {
  public static void main(String[] args) {
    A obj = (A) new B(); // upcasting
    obj.show1();
   // obj.show2(); // Can not call as object referenced to parent class

    B obj1 = (B) obj; // Downcasting
    obj1.show1();
    obj1.show2();
  }
}
