package interfaces;

interface A {
  int num = 10; // final and static
  String name = "Demo";
  void show();
  
}

interface B {
  void print();
}

interface C extends B {
  
}

class D implements A, C {
  public void show() {
    System.out.println("In Show");
  }

  public void print() {
    System.out.println("In print");
  }
}

public class InterfaceDemo {

  public static void main(String[] args) {
    A obj = new D();
    obj.show();

    B obj1 = new D();
    obj1.print();
    System.out.println(A.name);
    System.out.println(A.num);
  }
}
