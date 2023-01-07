package p5;

public class student {
    public int roll_no;
    public String name ;
    public int[] marks = new int[5];
    student() {
        System.out.println("Default Constructor");
    }
    student(int roll_no, String name, int[] marks ){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    public double findAverage() {
        int sum = 0 ;
        for(int i=0;i<5;i++) {
            sum += marks[i];
        } return sum / 5.0;
    }
}
