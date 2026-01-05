public class WrapperClassDemo {
    public static void main(String[] args) {
        int n = 2;
        Integer i = new Integer(2); // Boxing
        
        Integer num1 = 2; // Autoboxing

        int num2 = num1.intValue();  // Unboxing

        int num3 = num1; // Auto Unboxing
        
        String s = "12";

        int num4 = Integer.parseInt(s);
    }
}