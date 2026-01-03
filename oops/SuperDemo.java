class A {
  public A() {
    System.out.println("in A");
  }
  public A(int A) {
    System.out.println("In A paramaterized");
  }
}

class B extends A {
  public B() {
    System.out.println("In B");
  }
  public B(int a) {
    //super(a);
    this();
    System.out.println("In B paramaterized");
  }
}

public class SuperDemo {
  public static void main(String[] args) {
    new B(3);
  }
}
