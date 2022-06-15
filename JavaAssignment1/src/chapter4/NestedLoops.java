package chapter4;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String args []){
        //initialize what we know
        int numberOfStudents = 3;
        int numberOfExams = 2;
        Scanner scanner = new Scanner(System.in);

        //process all students
        for (int i = 0; i < numberOfStudents; i ++) {

            double total = 0;

            for (int j =0; j< numberOfExams;j++) {
                System.out.println("Enter the score of the Exam #" + (j +1));
                double score = scanner.nextDouble();
                total=total+score;

            }
            double studentAverage =total/numberOfExams;
            System.out.println("the average Score for the sudent  " + (i+1)+"is"+studentAverage);
            double  studentsAverage = studentAverage/numberOfStudents;
            System.out.print("The average score for students "+(i+1)+ studentsAverage );
        }
    }
}
