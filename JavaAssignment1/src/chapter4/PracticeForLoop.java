package chapter4;

import java.util.Scanner;

public class PracticeForLoop {
    public static void main(String args []){

        Scanner input = new Scanner(System.in);


        int score, sum =0;
        int numberOfStudents = 6;
        for (int i = 1 ; i <= 6; i ++){

            System.out.println("Please Enter the score of the student" +i);
            score = input.nextInt();
            sum+= score;


        }
        double average  = sum/numberOfStudents;

        System.out.println("the average is "+ average);

    }
}
