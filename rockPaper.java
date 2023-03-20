package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class rockPaper {
    public static void main(String[] args) {
        String [] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move");

        String playerMove;
        while (true){
           playerMove = scanner.nextLine();
           if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
               break;
           }
            System.out.println(playerMove + " is not valid move");
        }
        System.out.println("Computer move : " + computerMove);
        if (playerMove.equals(computerMove)){
            System.out.println("tie");
        }
        else if (playerMove.equals("r")){
            if (computerMove.equals("p")){
                System.out.println("you lose");
            }else if (computerMove.equals("s")){
                System.out.println("you win");
            }
        }else if (playerMove.equals("p")){
            if (computerMove.equals("r")){
                System.out.println("you win");
            }else if (computerMove.equals("s")){
                System.out.println("you lose ");
            }

        }else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                System.out.println("you lose");
            } else if (computerMove.equals("p")) {
                System.out.println("you win");


            }
        }
    }
}
