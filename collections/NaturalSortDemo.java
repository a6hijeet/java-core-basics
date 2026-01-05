package collections;

import java.util.*;

class Student implements Comparable<Student> {
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

  public int compareTo(Student s) {
    return this.age > s.age ? 1 : -1;
  }

}
public class NaturalSortDemo {
  public static void main(String[] args) {
    
    List<Student> s = new ArrayList<>();
    s.add(new Student("John", 30));
    s.add(new Student("Rock", 40));
    s.add(new Student("Black", 27));
    s.add(new Student("Roan", 34));
    s.add(new Student("Shane", 22));

    Collections.sort(s);

    System.out.println(s);


  }
}
