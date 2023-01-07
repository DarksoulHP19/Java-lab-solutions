import java.util.*;

public class p1{

    public static void main(String [] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a string");
        String s =s1.nextLine();
        String st  =s.toLowerCase();
        String str = "hi";
         int count =0;
         String a[] =st.split(" ");
         for (int i = 0; i < a.length; i++) {
            if(str.equals(a[i])){
                count = count +1;

            }
         }
         s1.close();
         System.out.println("Count of hi is :" + count);
    }
}
