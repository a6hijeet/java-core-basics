import access_modifier.others.*;

public class Access extends AccessA {
  public static void main(String[] args) {
    Access obj = new Access();

  //  System.out.println(obj.defaultNum); // not visible outside package
    System.out.println(obj.protectedNum); // can be accessed from parent class
  //  System.out.println(obj.privateNum); // private variable not accessible
    System.out.println(obj.getPrivateNum());
  }
}
