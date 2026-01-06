
record Student(int id, String name) {

  // Canonical constructor
  public Student(int id, String name){
    if(id == 0) 
      throw new IllegalArgumentException("Id can not be zero");

    this.id = id;
    this.name = name;
  }
};

public class CanonicalConstructor {
  public static void main(String[] args) {
    Student s1 = new Student(1, "John");
    System.out.println(s1); // prints value
    Student s2 = new Student(0, "John");
    System.out.println(s2); // run time exception
  }
}
