package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = scanner.nextInt(); // m
        System.out.print("Enter the day of the month: 1-31: ");
        int day = scanner.nextInt();  // q

        if(month == 1) {
            month = 13;
            year -= 1;
        }
        else if(month == 2) {
            month = 14;
            year -= 1;
        }

        int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;

        int h = (q + (26*(m+1)/10) + k + (k/4) + (j/4) + (5*j)) % 7;

        System.out.print("Day of the week is ");
        findDay(h);
    }

    public static void findDay(int day) {
        switch(day) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.print("Sunday");

                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");

                break;
            case 5:
                System.out.print("Thursday");

                break;
            case 6:
                System.out.print("Friday");
                break;
        }

    }
}
