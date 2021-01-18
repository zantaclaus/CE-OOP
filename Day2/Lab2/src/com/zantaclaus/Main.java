package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = scanner.nextInt();

        //Output
        int bot = (int) (Math.random() * 3) ;
        System.out.print("The computer is " + check(bot) + ". You are " + check(player));

        if(bot == 0) {
            if(player == 0)
                System.out.print(" too. It is a draw");
            else if(player == 1)
                System.out.print(". You won");
            else if(player == 2)
                System.out.print(". You loses");
        }
        else if(bot == 1) {
            if(player == 0)
                System.out.print(". You loses");
            else if(player == 1)
                System.out.print(" too. It is a draw");
            else if(player == 2)
                System.out.print(". You won");
        }
        else if(bot == 2) {
            if(player == 0)
                System.out.print(". You won");
            else if(player == 1)
                System.out.print(". You loses");
            else if(player == 2)
                System.out.print(" too. It is a draw");
        }


//        if(player > bot)
//            System.out.print(". You won");
//        else if(player < bot)
//            System.out.print(". You loses");
//        else
//            System.out.print(" too. It is a draw");
    }

    public static String check(int number) {
        if(number == 0)
            return "scissor";
        else if(number == 1)
            return "rock";
        else
            return "paper";
    }

}
