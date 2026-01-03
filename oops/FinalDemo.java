final class A {

  public void show() {
    System.out.println("From A");
  }

}

class B { //extends A  // Can not extend final class

  public final void show() {
    System.out.println("From B");
  }

  public final void show(int a) {
    System.out.println("From B parameter");
  }

}

class C extends B{

  public void show() { // Can not override final method
  }

}

public class FinalDemo {
  public static void main(String[] args) {
    final int num = 6;
    num = 7; // Can not change value of final variable
  }

}
