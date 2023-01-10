import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int dev = 0 ;
        try{
           dev = a / b ;
           System.out.println("Division is " + dev);
        }catch(ArithmeticException e ){
            System.out.println("ArithmeticException Caught "+ e.getMessage());
        }
        finally {
            System.out.println("Finally ended... Haashhh");
        }
    }
}
