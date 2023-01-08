
import java.util.Scanner;

public class primenumber{
    private int num;
    primenumber(int num){
   	 this.num=num;
    }
    public boolean IsPrimeNumber() {
   	 boolean flag=true;
   	 if(num == 2 || num == 3) {
   		 flag=true;
   	 }
   	 else if(num==1) {
   		 flag=false;
   	 }
   	 else {
   		 for(int i=2;i<num/2;i++) {
   			 if(num%i==0) {
   				 flag=false;
   				 break;
   			 }
   		 }
   	 }
   	 return flag;
    }
    public static void main(String[] args) {
   	 Scanner sc= new Scanner(System.in);
   	 int num=sc.nextInt();
   	 primenumber obj=new primenumber(num);
   	 System.out.println(obj.IsPrimeNumber());
   	 sc.close();
    }
}
