import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        try{
            int dev = a / b ;
            System.out.println(dev);
        }catch(ArithmeticException e){
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}
