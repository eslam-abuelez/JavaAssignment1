package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]) {
        //Initialize values we know
        int quota = 10;

        //Initialize unknown values
        System.out.print("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision on the path to take-output
        if (sales >= 10) {
            System.out.println("Congrats");
        }
        else{
        int salesShort = quota-sales;
            System.out.println("You did not make the sales quota, You need " + salesShort+ "More !");

            }
        }
    }