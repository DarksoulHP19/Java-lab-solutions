import java.util.Scanner;

public class p3 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your name :");
    String s = sc.nextLine();
    String a[] = s.split(" ");
    System.out.println(a[0].charAt(0) + "."+ a[1].charAt(0)+ "."+a[2]);
    sc.close();
   }
}
