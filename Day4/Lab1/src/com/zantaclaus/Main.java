package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var stock = new Stock();

        System.out.print("Symbol: ");
        stock.getSymbol(scanner.nextLine());

        System.out.print("Name: ");
        stock.getName(scanner.nextLine());

        System.out.print("Previous Closing Price: ");
        stock.getPreviousClosingPrice(scanner.nextDouble());

        System.out.print("Current Price: ");
        stock.getCurrentPrice(scanner.nextDouble());

        stock.getChangePercent();
        System.out.println("Price Change "+ stock.percent*100 +"%");
    }
}
