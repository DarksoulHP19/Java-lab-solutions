import java.util.*;
public class p2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s =sc.nextLine();
        String st =s.toLowerCase();
        char[] ch = st.toCharArray();

        int n = ch.length;
        boolean flag = true;
        for (int i = 0; i < n/2; i++) {
            if (ch[1] != ch[n-i-1]) {
                flag = true;
            }
        
        }
        if(flag){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        sc.close();
    }
}

