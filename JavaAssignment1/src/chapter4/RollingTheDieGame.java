package chapter4;

import java.util.Random;

public class RollingTheDieGame {
    public static void main(String args[]) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        System.out.println("Welcome to the Rolling Die Game.. let`s begin");
        for (int i = 1; i<=maxRolls ; i++) {
            int die = random.nextInt(6)+1;
            currentSpace = currentSpace + die;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == lastSpace) {
                System.out.print("You are in space " + currentSpace + "Congrats You`ve WON");
                break;
            }
               else if (currentSpace > lastSpace){
                   System.out.println("You lose, You are in Space "+ lastSpace);
                   break;
                }  else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
        }
    }
