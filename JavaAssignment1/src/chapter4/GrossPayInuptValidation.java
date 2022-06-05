package chapter4;

import java.util.Scanner;

public class GrossPayInuptValidation {
    public static void main(String args []){
        //Initialize Known Variables
        int rate = 15;
        int maxHours = 40;
        //Get Input For Unknown Variable
        System.out.println("How Many Hours did you work this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        //Validating Input
        while (hoursWorked>maxHours || hoursWorked <1){
            System.out.println("Invalid entry hours worked must be from 1 to 40, Please tyy again ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        //Calculate the gross
        double gross = rate *hoursWorked;
        System.out.println("Your Gross Pay is : " + gross);

    }
}
