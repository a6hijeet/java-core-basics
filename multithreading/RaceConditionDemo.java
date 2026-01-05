package multithreading;

class Counter {
  public int count;

  public synchronized void increase() {
    count++;
  }
}

public class RaceConditionDemo {
  public static void main(String[] args) {
    Counter c = new Counter();
    Runnable obj1 = () -> {
      for(int i=0; i<10000; i++){
        c.increase();
      }
    };
    Runnable obj2 = () -> {
      for(int i=0; i<10000; i++){
        c.increase();
      }
    };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(c.count);
  }
}
