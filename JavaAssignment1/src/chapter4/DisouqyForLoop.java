package chapter4;

import java.util.Scanner;

public class DisouqyForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sumOdd = 0, sumEven = 0;
        for (int i = 0; i <= 6; i++) ;
        {
            System.out.println("Enter your number" +i);
            number = input.nextInt();
            if (number % 2 == 0)
                sumEven += number;

            else
                sumOdd += number;
        }
        System.out.println("The sum of Even number is " + sumEven);
        System.out.println("The sum of Odd number is " + sumOdd);


    }}
