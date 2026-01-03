abstract class Car {
  public abstract void drive();
  public void playMusic() {
    System.out.println("Play music");
  }
}

class Honda extends Car { // Concreate class
  public void drive() { // must implement abstract method.
    System.out.println("Drive");
  }
}

public class AbstractDemo {
 public static void main(String[] args) {
  // Car c = new Car(); // Can not create object of abstract class.
  Car obj = new Honda();
  obj.drive();
  obj.playMusic();
 } 
}
