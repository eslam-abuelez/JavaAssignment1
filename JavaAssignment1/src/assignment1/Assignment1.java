package assignment1;

import javax.swing.*;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
// Create a program asks user and give the result on a[adjective]  [season] day, I drink a number of a [whole number]
// cups of coffee

System.out.println("In which Season do you consume the minimum cups of coffee ?");
        Scanner scanner = new Scanner(System.in);
        String season =scanner.next();

        System.out.println("What is the whole number of the coffee cups?");
        int numberOfCubs = scanner.nextInt();

        System.out.println("What is the adjective of the Season?");
        String adjectiveOfSeason =scanner.next();
        scanner.close();

        System.out.println("On a " + adjectiveOfSeason  +  season + "day , I drink a minimum of " +numberOfCubs + "cup/cups of coffee." );

    }
}
