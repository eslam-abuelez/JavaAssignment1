package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
//Initialize what we do not know
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your employer: ");
        double years = scanner.nextDouble();
        scanner.close();
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
                System.out.println("You are  Qualified to take the loan ");

        }      else {
            System.out.println("You have to earn $" + requiredSalary + "to qualify for the loan");
        }

    }
}
