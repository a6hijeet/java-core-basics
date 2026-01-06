
record Student(int id, String name) {

  // Compact Canonical constructor
  public Student{
    if(id == 0) 
      throw new IllegalArgumentException("Id can not be zero");

  }
};
public class CompactCanonicalConstructor {
   public static void main(String[] args) {
    Student s1 = new Student(1, "John");
    System.out.println(s1); // prints value
    Student s2 = new Student(0, "John");
    System.out.println(s2); // run time exception
  }
}
