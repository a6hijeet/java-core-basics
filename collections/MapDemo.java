package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> hm = new HashMap<>();

    hm.put("String1", 1);
    hm.put("String2", 2);
    hm.put("String3", 3);
    hm.put("String4", 4);
    hm.put("String5", 5);
    hm.put("String1", 5);

    for(String key: hm.keySet()) {
      System.out.println(key + " : " + hm.get(key));
    }


    Map<String, Integer> tm = new TreeMap<>();

    tm.put("String1", 1);
    tm.put("String2", 2);
    tm.put("String3", 3);
    tm.put("String4", 4);
    tm.put("String5", 5);
    tm.put("String1", 5);

    System.out.println(tm.values());
    System.out.println(tm.keySet());
    System.out.println(tm.get("String3"));

    Map<String, Integer> lhm = new LinkedHashMap<>();

    lhm.put("String1", 1);
    lhm.put("String2", 2);
    lhm.put("String3", 3);
    lhm.put("String4", 4);
    lhm.put("String5", 5);
    lhm.put("String1", 5);

    System.out.println(lhm.values());
    System.out.println(lhm.keySet());
    System.out.println(lhm.get("String3"));
  }
}
