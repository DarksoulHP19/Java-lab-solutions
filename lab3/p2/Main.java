import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        TestStudent tS = new TestStudent();
        tS.main();
    }
}


// person class
class Person{
    // memembers
    private String name;
    private int age ;
    // constructor
    Person(){

    }
    Person(String name, int age){
        this.name = name ;
        this.age = age ;
    }
    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
// student class
class Student extends Person{
    static int count ;
    private int rollno;
    private double[] marks = new double[5] ;
    // constructor
    public Student(int rollno, double[] marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public Student() {
        count++;
    }
    public Student(int rollno){
        this.rollno = rollno;
        count++;
    }
    public Student(int rollno, String name, int age, double[] marks){
        super(name,age);
        this.rollno = rollno;
        this.marks = marks;
        count++;
    }
    // getter and setter
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public static void setCount(){
        count = 0 ;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
    void displayDetails(){
        System.out.println("Roll No = "+ rollno );
        System.out.println("Name = "+ getName());
        System.out.println("Age = "+ getAge());
        System.out.println("Marks = "+ Arrays.toString(marks));
    }


}


// for testing
class TestStudent{
    public void main(){
        Scanner sc = new Scanner(System.in);
        Student[] stuArray = new Student[3];
        int rollno;
        int age;
        String name ;

        for(int i=0;i<3;i++){
            double[] marks = new double[5];
            System.out.println("Enter Roll No");
            rollno = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name");
            name = sc.nextLine();

            System.out.println("Enter age");
            age = sc.nextInt();

            System.out.println("Enter marks of 5 subjects");
            for(int j=0;j<5;j++){
                marks[j] = sc.nextInt();
            }
            stuArray[i] = new Student(rollno,name,age,marks);
//            stuArray[i].setMarks(marks);
//            stuArray[i].setRollno(rollno);
//            stuArray[i].setAge(age);
//            stuArray[i].setName(name);

        }

        double[] avg = new double[3];

        for(int i=0;i<3;i++){

            double sum = 0 ;
            double[] arr = stuArray[i].getMarks();

            for(int j=0;j<arr.length;j++){
                sum += arr[j];
            }

            avg[i] = sum / arr.length;
        }

        int highest = 0 ;
        double highestAvg = 0 ;

        for(int i=0;i<3;i++){

            if(highestAvg < avg[i]){
                highest = i ;
                highestAvg = avg[i];
            }
        }
        stuArray[highest].displayDetails();

        // getcount
        System.out.println("Total objects created");
        Student st = new Student();
        System.out.println(Student.getCount());

    }
}
