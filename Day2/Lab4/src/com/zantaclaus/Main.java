package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] city = new String[5];

        System.out.print("Enter the first city: ");
        city[1] = scanner.nextLine();

        System.out.print("Enter the second city: ");
        city[2] = scanner.nextLine();

        System.out.print("Enter the third city: ");
        city[3] = scanner.nextLine();

        for(int i = 1; i <= 2; i++) {
            for(int j = 1; j <= 2; j++) {
                if(city[j].compareTo(city[j+1]) > 0) {
                    String temp = city[j];
                    city[j] = city[j+1];
                    city[j+1] = temp;
                }
            }
        }

        System.out.print("The three cities in alphabetical order are ");
        System.out.print(city[1] + " " + city[2] + " " + city[3]);

    }
}
