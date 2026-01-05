package collections;

import java.util.*;

class Student {
  int age;
  String name;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    return "Name : " + this.name + " Age : " + this.age; 
  }
}
public class SortListDemo {
  public static void main(String[] args) {
    // Compare using last digit.
    Comparator<Integer> c = new Comparator<Integer>() {
      public int compare(Integer i, Integer j){
        return i%10 < j%10 ? 1 : -1;
      }
    };

    List<Integer> num = new ArrayList<>();
    num.add(103);
    num.add(52);
    num.add(35);
    num.add(89);
    num.add(96);
    // Print default ordered List
    System.out.println(num);
    // Sort list
    Collections.sort(num, c);
    // Print sorted order List
    System.out.println(num);

    List<Student> s = new ArrayList<>();
    s.add(new Student("John", 30));
    s.add(new Student("Rock", 40));
    s.add(new Student("Black", 27));
    s.add(new Student("Roan", 34));
    s.add(new Student("Shane", 22));


    Comparator<Student> sc = (Student s1, Student s2) -> s1.age < s2.age ? 1 : -1;

    Collections.sort(s, sc);

    System.out.println(s);


  }
}
