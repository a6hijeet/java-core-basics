package multithreading;

class A extends Thread{
  public void run() {
    for(int i=0; i<10; i++) {
      System.out.println("Hi"); 
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }  
    }
  } 
}

class B extends Thread{
  public void run() {
    for(int i=0; i<10; i++) {
      System.out.println("Hello");  
       try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }   
    }
  } 
}

public class ThreadAlternate {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();

    obj1.start();
    // To get Hi Hello one after other
    // It depends on scheduler we can not predict the output
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    obj2.start();
  }
}
