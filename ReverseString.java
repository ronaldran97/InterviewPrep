/**
 * Created by ronaldtran on 5/16/19.
 */
import java.util.Scanner;

public class ReverseString {
  public static void main(String args[]) {
    usingFor();
    usingSBClass();
  }

  public static void usingFor() {
    System.out.println("Enter a string: ");

    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    String reverse = "";

    for (int i = str.length() - 1; i >=0; i--) {
      reverse = reverse + str.charAt(i);
    }

    System.out.println("The string is: " + reverse);
  }

  //this method uses java's StringBuilder Class
  public static void usingSBClass() {
    System.out.println("Enter a string: ");

    Scanner read = new Scanner(System.in);
    String str = read.nextLine();

    StringBuilder sb = new StringBuilder();

    for(int i = str.length() - 1; i >= 0; i--)
    {
      sb.append(str.charAt(i));
    }

    System.out.println("Reversed string is:");
    System.out.println(sb.toString());

  }

  //this will use StringBuilder Class's reverse function
  public static void usingReverse() {
    System.out.println("Enter string to reverse:");

    Scanner read = new Scanner(System.in);
    String str = read.nextLine();

    StringBuilder sb = new StringBuilder(str);

    System.out.println("Reversed string is:");
    System.out.println(sb.reverse().toString());
  }


}
