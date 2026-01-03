class A {
  int num;
  String name;
  
  // Generated using source
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + num;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  // Generated using source
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    A other = (A) obj;
    if (num != other.num)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
  
  
}

public class ObjectCompare {
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.num = 10;
    obj1.name = "Demo";

    A obj2 = new A();
    obj2.num = 10;
    obj2.name = "Demo";

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));


    String s1 = "Demo";
    String s2 = "Demo";
    String s3 = new String("Demo");

    System.out.println(s1 == s2); // true. poiting to same memory
    System.out.println(s1 == s3); // false. pointing to different memory
    System.out.println(s1.equals(s2)); // true. this checks the value
    System.out.println(s1.equals(s3)); // true. this checks the value
  }
}
