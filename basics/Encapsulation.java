class Member {
  private String name;
  private int age;

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
}

public class Encapsulation {
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.setAge(30);
    m1.setName("John");

    System.out.println(m1.getName() + " : " + m1.getAge());

    Member m2 = new Member();
    m2.setAge(40);
    m2.setName("Dove");

    System.out.println(m2.getName() + " : " + m2.getAge());
  }
}
