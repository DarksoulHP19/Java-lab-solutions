
import java.util.*;

public class p4 {
    public static void main(String args[]){
        System.out.println("Enter the name of Student");
        Scanner v1=new Scanner(System.in);
        String name=v1.nextLine();
        System.out.println("Enter the Roll number of Student");
        Scanner v2=new Scanner(System.in);
        int roll_no=v2.nextInt();
        System.out.println("Enter the marks of Student in five subjects");
        Scanner v3=new Scanner(System.in);
        int marks[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
        marks[i]=v3.nextInt();
        sum = sum + marks[i];
        }
        float avg=(sum/5);
        char grad;
        if(avg>80)
        grad='A';
        else if(avg > 70)
        grad='B';
        else if(avg > 60)
        grad='C';
        else if(avg > 50)
        grad='D';
        else
        grad='F';
        System.out.print(name+" is having roll no. "+roll_no+" is having "+avg +"average marks and having "+grad+" grad ");
        v1.close();
        v2.close();
        v3.close();
        }
        }    
    

