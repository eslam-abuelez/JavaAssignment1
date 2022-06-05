package chapter2;

import java.util.Scanner;

import static java.lang.System.in;

public class GrossPayCalculator {
    public static void main (String args[]){
        //1-Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner =  new Scanner(System.in);
        int hours = scanner.nextInt();

        //2- Get the Hourly Pay Rate
        System.out.println("Enter the Employee PAY Rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3- Multiply Hours and Pay Rate
       double grossPay = hours * rate ;
       //4- Display Gross Pay
        System.out.println("The employee Gross Salary is $"+grossPay);

    }
}
