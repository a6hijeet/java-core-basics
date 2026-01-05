import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class IODemo {
  public static void main(String[] args) throws IOException{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader b = new BufferedReader(in);
    System.out.println("Using BufferedReader Enter name");
    String name = b.readLine();
    System.out.println("Hello " + name);
    b.close();

    Scanner sc = new Scanner(System.in);
    System.out.println("Using Scanner Enter name");
    String userInput = sc.nextLine();
    System.out.println("Hello " + userInput);
    sc.close();

    Scanner sc1 = new Scanner(System.in);
    System.out.println("User scanner Enter name");
    String username = sc1.nextLine();
    System.out.println("User scanner Enter age");
    int age = sc1.nextInt();

    System.out.println("User name " + username + " : Age " + age);
    sc1.close();
  }
}
