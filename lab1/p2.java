import java.util.*;
public class p2 {
public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
int inp = Scan.nextInt();
for (int i = 0; i <= inp; i++) {
if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
System.out.println(i);
}
}
Scan.close();
}
}