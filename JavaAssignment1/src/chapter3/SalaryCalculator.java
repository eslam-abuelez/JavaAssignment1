package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int qouta = 10;

        //Get values for the unknown
        System.out.print("How many sales did the employee make this month");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > qouta){
            salary = salary + bonus;
        }

        //Output
        System.out.print("Salary of the employee is $" + salary);
    }
}
