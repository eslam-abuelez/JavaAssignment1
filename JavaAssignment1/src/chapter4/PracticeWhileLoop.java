package chapter4;

import java.util.Scanner;
// While loop ask user how many years experience, how many days off in each year, sum the total of days off during work,
//ask the user if he wants to resubmit
public class PracticeWhileLoop {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("how many years experience do you have?");
            double experienceYears = scanner.nextDouble();
            System.out.println("how many days off in each year?");
            double daysOffPerYear = scanner.nextInt();
            double sumOfDaysOff = daysOffPerYear * experienceYears;
            System.out.println("sum the total of days off during work is: " + sumOfDaysOff);
            System.out.println("Do you want to resubmit?");
            again = scanner.nextBoolean();
        }
        while (again);
        scanner.close();
    }

}
