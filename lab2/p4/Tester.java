package p4;

import java.util.Scanner;

public class Tester {
    public static StringBuffer removewhitespac(StringBuffer s){
        for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ' || s.charAt(i) == '\t' ){
                s.delete(i,i+1);

                }
        }
    return s;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a  string: ");
        String str = scan.nextLine();
        StringBuffer s =new StringBuffer(str);
        System.out.println(removewhitespac(s));
    }
}
