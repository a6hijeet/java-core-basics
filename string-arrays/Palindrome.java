public class Palindrome {

  public static boolean isPalindromeString(String s) {
    String newString ="";

    for(int i= s.length() - 1; i >=0; i--) {
      newString = newString + s.charAt(i);
    }
  
    return s.equals(newString);
  }

  public static boolean isPalindromeStringBuffer(String s) {
    StringBuffer sb = new StringBuffer(s);
    return s.equals(sb.reverse().toString());
  }
  
  public static boolean isPalindrome(int num) {
    int originalInt = num;
    int reverse = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num = num / 10;
    }

    return originalInt == reverse;
  }

  public static void main(String[] args) {
    /* int num = 123321;
    System.out.println(isPalindrome(num));
    String s = "abcdefedcba";
    System.out.println(isPalindromeStringBuffer(s)); */
    String s = "abcba";
    System.out.println(isPalindromeString(s));
  }
}
