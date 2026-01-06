import java.util.*;
import java.util.function.Consumer;

public class ForLoopDemo {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(2,3,4,5,6);
    // Normal way.
    System.out.println("Normal for loop");
    for(int i=0; i<nums.size(); i++) {
      System.out.println(nums.get(i));
    }

    // Enhanced for loop
    System.out.println("Enhanced for loop");
    for(int n : nums) {
      System.out.println(n);
    }

    // Using forEach.
    System.out.println("forEach");
    Consumer<Integer> c = new Consumer<Integer>() {
      public void accept(Integer n) {
        System.out.println(n);
      }
    };

    nums.forEach(c);

    // Using forEach with lambda expression.
    System.out.println("forEach using lambda expression");
    nums.forEach(n -> System.out.println(n));

    
  }
}
