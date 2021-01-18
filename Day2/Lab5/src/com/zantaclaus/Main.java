package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int count = n;
            for(int j = n - 1; j > i; j--) {
                System.out.print("  ");
                count--;
            }

            for(int j = 0; j <= i; j++) {
                System.out.printf("%d ", count);
                count--;
            }

            for(int j = 1; j <= i; j++) {
                System.out.printf("%d ", j+1);
            }
            System.out.println("");
        }
    }
}
