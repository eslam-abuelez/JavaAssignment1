package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args []){
        // require entering text
        System.out.println("Please Insert Text");
        Scanner scanner= new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        //Search text for letter A/a
        boolean letterFound;
        for (int i = 0; i< text.length();i ++) {
            char currentLetter = text.charAt(i);
            if (currentLetter = A || currentLetter = a) {
                letterFound = true;
                System.out.println("Letter A has been found");

            }
            else {
                System.out.println("Letter A has not been found");
            }
        }

    }

}
