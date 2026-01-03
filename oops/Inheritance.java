import calculator.*;


public class Inheritance {
  public static void main(String[] args) {
    AdvancedCalculator c = new AdvancedCalculator();
    System.out.println(c.add(4, 2));
    System.out.println(c.sub(6, 2));
    System.out.println(c.mul(5, 2));
    System.out.println(c.div(15, 3));
    System.out.println(c.power(4, 2));
  }
}
