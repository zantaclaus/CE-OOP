package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter today's day: ");
        int today = scanner.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int nextDay = scanner.nextInt();


        // Output
        System.out.print("Today is ");
        findDay(today);

        System.out.print(" and the future day is ");
        findDay(today+nextDay);


    }

    public static void findDay(int day) {
        switch(day % 7) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
        }

    }
}
