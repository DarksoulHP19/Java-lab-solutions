import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fR, fC, sR, sC;
        System.out.println("Enter Dimensions");
        System.out.println("Enter Number of Rows of First Matrix");
        fR = sc.nextInt();
        System.out.println("Enter Number of Columns of First Matrix");
        fC = sc.nextInt();
        System.out.println("Enter Number of Rows of Second Matrix");
        sR = sc.nextInt();
        System.out.println("Enter Number of Columns of Second Matrix");
        sC = sc.nextInt();
        if (fC != sR) {
            System.out.println("Cannot do Multiplication");
        }
        if (fC != sC && sR != fR) {
            System.out.println("Cannot do addition");
        }
        int mat1[][] = new int[fR][fC];
        int mat2[][] = new int[sR][sC];
        System.out.println("Enter first matrix");
        for (int i = 0; i < fR; i++) {
            for (int j = 0; j < fC; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix");
        for (int i = 0; i < sR; i++) {
            for (int j = 0; j < sC; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        int addR = fR;
        int addC = fC;

        int add[][] = new int[addR][addC];
        for (int i = 0; i < addR; i++) {
            for (int j = 0; j < addC; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        } // multiplication
        int mulR = fR;
        int mulC = sC;
        int mul[][] = new int[mulR][mulC];
        for (int i = 0; i < mulR; i++) {
            for (int j = 0; j < mulC; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mulC; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Sum of Two Matrices");
        for (int[] x : add) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("Multiplication of Two Matrices");
        for (int[] x : mul) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}