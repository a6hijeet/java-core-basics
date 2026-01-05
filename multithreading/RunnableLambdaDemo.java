package multithreading;

class A implements Runnable{
  public void run() {
    for(int i=0; i<10; i++) {
      System.out.println("Hi");   
    }
  } 
}

class B implements Runnable{
  public void run() {
    for(int i=0; i<10; i++) {
      System.out.println("Hello");   
    }
  } 
}
public class RunnableLambdaDemo {
  public static void main(String[] args) {
    Runnable obj1 = () -> {
      for(int i=0; i<10;i++){
        System.out.println("Hi");
      }
    };
    Runnable obj2 = () -> {
      for(int i=0; i<=10; i++) {
        System.out.println("Hello");
      }
    };


    obj1.run();
    obj2.run();

  }
}
