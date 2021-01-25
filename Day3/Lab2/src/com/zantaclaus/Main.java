package com.zantaclaus;

import javax.imageio.ImageReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int n_list1 = scanner.nextInt();
        int[] list1 = new int[n_list1];
        for(int i = 0; i < n_list1; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2: ");
        int n_list2 = scanner.nextInt();
        int[] list2 = new int[n_list2];
        for(int i = 0; i < n_list2; i++) {
            list2[i] = scanner.nextInt();
        }

        System.out.print("The merged list is ");
        int[] ans = merge(list1, list2);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        //list1 = 1 2 3 4 5
        //list2 = 7 8 6
        //sortedList = 1 2 3 4 5 7 8 6
        int[] sortedList = new int[list1.length + list2.length];

        for(int i = 0; i < list1.length; i++) {
            sortedList[i] = list1[i];
        }

        for(int i = 0; i < list2.length; i++) {
            sortedList[list1.length + i] = list2[i];
        }

        for(int i = 0; i < sortedList.length - 1; i++) {
            for(int j = 0; j < sortedList.length - 1; j++) {
                if( sortedList[j] > sortedList[j+1]) {
                    int temp = sortedList[j];
                    sortedList[j] = sortedList[j+1];
                    sortedList[j+1] = temp;
                }
            }
        }

        return sortedList;
    }
}
