public class StringDemo {
  public static void main(String[] args) {
    String s = "Hello";
    s = s.replace("lo", "lp");
    System.out.println(s);

    StringBuffer sb = new StringBuffer("Testss");
    sb.append(" test");
    System.out.println(sb);
    sb.deleteCharAt(2);
    sb.insert(4, " Added text ");
    System.out.println(sb);
    System.out.println(sb.capacity());

  }
}
