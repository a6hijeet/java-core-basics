package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
  public static void main(String[] args) {
    List<Integer> al = new ArrayList<>();
    for(int i=1; i<=5; i++){
      al.add(i);
    }
    al.remove(2);
    Iterator<Integer> values = al.iterator();

    while(values.hasNext()) {
      System.out.println(values.next());
    }


    List<Integer> v = new Vector<>();
    for(int i=1; i<=5; i++){
      v.add(i);
    }
    v.remove(2);
    System.out.println(v);

    List<Integer> ll = new LinkedList<>();
    for(int i=1; i<=5; i++){
      ll.add(i);
    }

    System.out.println(ll);

    List<Integer> st = new Stack<>();
    for(int i=1; i<=5; i++){
      st.add(i);
    }
    System.out.println(st);
  }
}
