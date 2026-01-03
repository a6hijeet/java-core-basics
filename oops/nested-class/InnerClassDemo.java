class A {
  int age;
  String name;

  public void show() {
    System.out.println("In A show");
  }

  class B {
    public void print() {
      System.out.println("In B print");
    }
  }

  static class C {
    public void config() {
      System.out.println("In static C config");
    }
  }
}

public class InnerClassDemo {
  public static void main(String[] args) {
    System.out.println("HELLO");
    A obj = new A();
    obj.show();

    A.B obj1 = obj.new B();
    obj1.print();
    new A.C().config();
  }
}
