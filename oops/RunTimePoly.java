// Runtime polymorphism
class A {
  public void show() {
    System.out.println("From A");
  }
}

class B extends A {
  public void show() {
    System.out.println("From B");
  }
}

class C extends A {
  public void show() {
    System.out.println("From C");
  }
}

public class RunTimePoly {
  public static void main(String[] args) {
    // Which method to run will be decided at run time
    // Run time polymorphism 
    // Dynamic method dispatch
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }
}
