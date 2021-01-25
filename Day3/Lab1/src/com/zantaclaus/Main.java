package com.zantaclaus;

public class Main {

    public static void main(String[] args) {
        int ans = 0;
        int newLine = 0;

        for (int number = 2; ans < 100; number++) {
            if (checkPrime(number)) {
                if (checkPalindrome(number)) {
                    System.out.print(number+" ");
                    ans++;

                    newLine++;
                    if(newLine % 10 == 0)
                        System.out.println("");
                }
            }
        }

        System.out.print("Prime: "+ans);
    }

    public static boolean checkPrime(int number) {
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //number =   1 0 3 0 1  -> len = 5
    //index  =   0 1 2 3 4  -> 0:4  1:3  2:2 --> i:len-i-1

    public static boolean checkPalindrome(int number) {
        String message = String.valueOf(number);
        for(int i = 0; i < message.length(); i++) {
            if(message.charAt(i) != message.charAt(message.length() - 1 - i))
                return false;
        }

        return true;
    }
}

// i + j == len - 1