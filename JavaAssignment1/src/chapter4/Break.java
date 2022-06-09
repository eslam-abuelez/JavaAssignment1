package chapter4;

import java.util.Scanner;

public class Break {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int counter = 0, sum = 0, num;
       while (counter<= 7){

           System.out.println("Enter your positive number:");
           num = input.nextInt();
           if (num <0){
               System.out.println("Negative numbers are not allowed");
               break;
           }
           sum = sum + num;
           counter ++;
       }
        System.out.println("Sum  = " + sum);

    }
}
