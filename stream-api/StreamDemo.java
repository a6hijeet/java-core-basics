import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4,6,8,3,2);

    Stream<Integer> s1 = nums.stream();
    Stream<Integer> s2 = s1.filter(n -> n%2==0); // returns even no.
    //s2.forEach(n -> System.out.println(n));
    Stream<Integer> s3 = s2.map(n -> n*2); // doubles the even no return previously
    //s3.forEach(n -> System.out.println(n));

    int res = s3.reduce(0, (c,e) -> c+e);
    System.out.println(res);

    
    int res1 = nums.stream()
      .filter(n -> n%2==0)
      .map(n->n*2)
      .reduce(0, (c,e) -> c+e);
    System.out.println(res1);



  }
}
