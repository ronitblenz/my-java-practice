package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("RULES: \n\t0 to input Rock\n\t1 to input Paper\n\t2 to input Scissor");
        //char r,p,s;
        int my_turn, computer_turn;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Turn: ");
        my_turn = sc.nextInt();
        switch (my_turn) {
            case 0:
                System.out.println("Your input is Rock");
                break;
            case 1:
                System.out.println("Your input is Paper");
                break;
            case 2:
                System.out.println("Your input is Scissor");
                break;
            default:
                System.out.println("Invalid Input, Please try again later");
        }
        System.out.println("This is Computer's Turn");
        computer_turn = rand.nextInt(3);
        System.out.println(computer_turn);
        switch (computer_turn) {
            case 0:
                System.out.println("Computer got Rock");
                break;
            case 1:
                System.out.println("Computer got Paper");
                break;
            case 2:
                System.out.println("Computer got Scissor");
                break;
        }
            if (my_turn == computer_turn) {
                System.out.println("Match Draw!");
            } else if ((my_turn == 0 && computer_turn == 2) || (my_turn == 1 && computer_turn == 0) || (my_turn == 2 && computer_turn == 1)) {
                System.out.println("Congratulations, You won!");
            } else {
                System.out.println("You lose! Better luck next time.");

            }
        }
    }