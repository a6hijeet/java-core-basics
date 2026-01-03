class A {
  public void show() {
    System.out.println("In A show");
  }
}

public class AnonymousInner {
  public static void main(String[] args) {
    A obj = new A(){
      public void show() {
        System.out.println("In anonymoust show");
      }
    };
    obj.show();
  } 
}
