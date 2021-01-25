package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2); /// [0,2) --> 0 1
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        checkRow(matrix);
        checkColumn(matrix);
        System.out.println(checkSuperDiagonal(matrix));
        System.out.println(checkDiagonal(matrix));
        System.out.println(subDiagonal(matrix));
    }

    public static void checkRow(int[][] matrix){
        boolean pass = false;

        for(int i = 0; i < matrix.length; i++) {
            int count = 0;
            int num = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == num) {
                    count++;
                }
            }
            if(count == matrix[i].length) {
                pass = true;
                System.out.println("All " + num + "s on row " + i);
            }
        }

        if(!pass) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void checkColumn(int[][] matrix){
        boolean pass = false;
        for(int i = 0; i < matrix.length; i++) {
            int num = matrix[0][i];
            int count = 0;
            for(int j = 0; j < matrix[i].length; j ++) {
                if(matrix[j][i] == num) {
                    count++;
                }
            }
            if(count == matrix[i].length) {
                pass = true;
                System.out.println("All " + num + "s on column " + i);
            }
        }
        if(!pass) {
            System.out.println("No same numbers on a column");
        }
    }

    public static String checkSuperDiagonal(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++) {
            if(matrix[i][i+1] != matrix[0][1]) {
                return "No same numbers on the superdiagoanl";
            }
        }
        return "All "+matrix[0][1]+"s on the superdiagonal";
    }

    public static String checkDiagonal(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] != matrix[0][0]) {
                return "No same numbers on the diagoanl";
            }
        }
        return "All "+matrix[0][0]+"s on the diagonal";
    }

    public static String subDiagonal(int[][] matrix) {
        for(int i = 1; i < matrix.length; i++) {
            if(matrix[i][i-1] != matrix[1][0]) {
                return "No same numbers on the subdiagoanl";
            }
        }
        return "All "+matrix[0][1]+"s on the subdiagonal";
    }
}
