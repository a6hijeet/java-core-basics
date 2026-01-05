
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class ExceptionDemo {
   public static void main(String[] args) {
     
    
     int i = 0;
     int j = 0;
     try {
         if( i == 0)
            throw new MyException("Custom message from exception");
         j = 100/i;
     }
     catch(MyException e) {
        System.out.println("In Arithmetic " + e);
     }
     catch(Exception e) {
        System.out.println("In Exception" + e);
     }
     finally {
        System.out.println("Called");
     }

     System.out.println(j);
   } 
}
