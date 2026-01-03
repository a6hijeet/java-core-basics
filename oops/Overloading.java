public class Overloading {
  public void print(){
    System.out.println("This is simple method");
  } 

  public void print(int n) {
    System.out.println("This is overloaded method");
  }

  public static void show() {
    System.out.println("Static show");
  }

  public static void show(int num) {
    System.out.println("Static show parameter");
  }

  public static void main(String[] args) {
    Overloading obj = new Overloading();

    obj.print();
    obj.print(2);
    Overloading.show();
    Overloading.show(5);
  }
}
