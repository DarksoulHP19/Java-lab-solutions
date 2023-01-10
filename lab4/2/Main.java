import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatchExercise ce = new CatchExercise();
        ce.main();
    }
}


class CatchExercise{
    void main(){
        try{
            int a[] = new int[2];
            a[5] = 30/5;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught "+ e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught " + e.getMessage());
        }
    }
}
