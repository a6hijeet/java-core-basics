import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExplained {
   public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4,6,8,3,2);
    // Filter Using lambda expression.
    // Stream<Integer> s1 = nums.stream().filter(n -> n%2==0); // returns even no.
    // s1.forEach(n -> System.out.println(n))

    // Filter explained.
    Predicate<Integer> p = new Predicate<Integer>() {
      public boolean test(Integer n) {
        return n%2==0;
      }
    };
    Stream<Integer> s1 = nums.stream().filter(p); // returns even no.
    s1.forEach(n -> System.out.println(n));

    // Map using lambda expression.
    // Using Lambda expression
    // Stream<Integer> s2 = nums.stream().map(n -> n*2); // doubles the even no return previously
    // s2.forEach(n -> System.out.println(n))

    // Map explained.
    Function<Integer, Integer> f = new Function<Integer,Integer>() {
      public Integer apply(Integer n) {
        return n*2;
      }
    };
    Stream<Integer> s2 = nums.stream().map(f); // doubles the value
    s2.forEach(n -> System.out.println(n));

    // Reduce using lambda expression.
    // int res = nums.stream().reduce(0, (c,e) -> c+e);
    // System.out.println("Reduced " + res);

    // Reduce explained.
    BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
      public Integer apply(Integer t, Integer u) {
        return t + u;
      }
    };
    int res = nums.stream().reduce(0, b);
    System.out.println("Reduced " + res);
  }
}
