package p5;

import java.util.Scanner;
public class TestStudent {
    public void main() {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 0) {
            System.out.println("pls enter the values");

            System.out.println("Enter Roll No: ");
            int roll_no = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter marks of 5 Subjects");
            int marks[] = new int[5];
            for(int i=0;i<5;i++) {
                marks[i] = sc.nextInt();
            }
            student st = new student(roll_no,name,marks);

            System.out.println("Roll No: "+ st.roll_no);
            System.out.println("Name: "+ st.name);
            System.out.println("Marks: ");
            for(int i=0;i<5;i++) {
                System.out.print(st.marks[i] + " ");
            }
        }else {
            System.out.println("Running (b)");

            student[] stArray = new student[3];

            for(int i=0;i<3;i++) {
                System.out.println("Enter Roll No: ");
                int roll_no = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name : ");
                String name = sc.nextLine();
                System.out.println("Enter marks of 5 Subjects");
                int marks[] = new int[5];
                for(int j=0;j<5;j++) {
                    marks[j] = sc.nextInt();
                }
                student st = new student(roll_no,name,marks);
                stArray[i] = st;
            }
            double avgMarks[] = new double[3];
            int highest = 0 ;
            double highestMarks = 0 ;

            for(int i=0;i<3;i++) {
                avgMarks[i] = stArray[i].findAverage();
                if(highestMarks < avgMarks[i]) {
                    highestMarks = avgMarks[i];
highest = i;
        }
        }
        System.out.println("Roll No: "+ stArray[highest].roll_no);
        System.out.println("Name: "+ stArray[highest].name);
        System.out.println("Marks: ");
        for(int i=0;i<5;i++) {
        System.out.print(stArray[highest].marks[i]+ " ");
        }
        }
        }
        }