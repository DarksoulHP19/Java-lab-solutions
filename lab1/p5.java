// import java.util.*;

public class p5 {
    static int sumofeve(int arr[]){
        int sum=0;
        for (int i : arr) {
        if (i%2 == 0)
        sum =sum + i;
        }
        return sum;
        }
        public static void main(String[] args) {
        int a[] = { 68, 79, 86, 99, 23, 2, 41, 100 };
        int soe = sumofeve(a);
        System.out.println("sum of even no, is " + soe);
        }
}
