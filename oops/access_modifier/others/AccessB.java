package access_modifier.others;

public class AccessB extends AccessA{

  public static void main(String[] args) {
    AccessA obj = new AccessA();

    System.out.println(obj.defaultNum); // accesible becuase in same package
    System.out.println(obj.protectedNum); // accesible from parent class
   // System.out.println(obj.privateNum); // not accesible
    System.out.println(obj.getPrivateNum()); // not accesible
  }
}
