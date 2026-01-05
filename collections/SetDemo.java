package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> hs = new HashSet<>();
    for(int i=1; i<=5; i++){
      hs.add(i);
    }
    hs.remove(2);
    System.out.println(hs);

    Set<Integer> ts = new TreeSet<>();
    for(int i=1; i<=5; i++){
      ts.add(i);
    }
    ts.remove(2);
    System.out.println(ts);

    Set<Integer> lhs = new LinkedHashSet<>();
    for(int i=1; i<=5; i++){
      lhs.add(i);
    }
    lhs.remove(2);
    System.out.println(lhs);

  
  }
}
