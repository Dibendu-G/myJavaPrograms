package com.company;
import java.util.Random;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

//        Ignore This it's Just a Header

            System.out.println("========================");
            System.out.println("  WELCOME TO JAVA GAME   ");
            System.out.println("========================");

//            Initialization
            int user, comp, i=1;

        while(i<=5) {
//        Taking USER Input

            Scanner Sc = new Scanner(System.in);
            System.out.println("Press the number you want to choose-\n1-Rock\n2-Paper\n3-Scissors");
            user = Sc.nextInt();
            switch (user)
            {
                case 1 -> System.out.println("You have Chosen Rock");
                case 2 -> System.out.println("You have Chosen Paper");
                case 3 -> System.out.println("You have Chosen Scissors");
            }
//        Generating Random Numbers

            Random number = new Random();
            comp = number.nextInt(3) + 1;
            switch (comp)
            {
                case 1 -> System.out.println("Computer have Chosen Rock");
                case 2 -> System.out.println("Computer have Chosen Paper");
                case 3 -> System.out.println("Computer have Chosen Scissors");
            }

//            Logical Part

            if (comp==user)
            {
                System.out.println("Its Draw");
            }
            else if(comp == 3 && user == 1 || comp == 1 && user == 2 || comp == 2 && user == 3)
            {
                System.out.println("You Wins");
            }
            else
            {
                System.out.println("Computer Wins");
            }
            i++;

//            Ignore This it's Just a Footer

            System.out.println("===================================");
            System.out.println("  This Game is Created by Dibendu  ");
            System.out.println("===================================");
        }
    }
}
