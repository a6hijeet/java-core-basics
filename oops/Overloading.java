public class Overloading {
  public void print(){
    System.out.println("This is simple method");
  } 

  public void print(int n) {
    System.out.println("This is overloaded method");
  }

  public static void main(String[] args) {
    Overloading obj = new Overloading();

    obj.print();
    obj.print(2);
  }
}
