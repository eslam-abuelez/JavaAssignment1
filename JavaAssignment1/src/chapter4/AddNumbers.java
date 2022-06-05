package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        boolean  again;
        do {
            System.out.println("Enter the first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the Second Number");
            double secondNumber = scanner.nextDouble();
            double sum = firstNumber +secondNumber;
            System.out.println("the Sum is:" + sum);
            System.out.println("Would you like to start over");
            again = scanner.nextBoolean();
        }
        while (again);
        scanner.close();
    }
}

