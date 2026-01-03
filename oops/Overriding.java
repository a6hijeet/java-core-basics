
class Demo {
  public void print() {
    System.out.println("Print from Demo Print");
  }
  public void show() {
    System.out.println("Print from Demo Show");
  }
}

class Demo2 extends Demo {
  public void show() {
    System.out.println("Print from Demo2 Show");
  }
}
public class Overriding {
  public static void main(String[] args) {
    Demo2 d = new Demo2();
    d.print();
    d.show();
  }
}
