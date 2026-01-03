class A {
  public void show() {
    System.out.println("In A show");
  }
}

abstract class B {
  public abstract void print();
  public abstract void config();
}
public class AnonymousInner {
  public static void main(String[] args) {
    A obj = new A(){
      public void show() {
        System.out.println("In anonymoust show");
      }
    };
    obj.show();

    B obj1 = new B(){
      public void print() {
        System.out.println("Anonymoust abstract B print");
      }

      public void config() {
        System.out.println("Anonymoust abstract B config");
      }
    };
    obj1.print();
    obj1.config();
  } 
}
