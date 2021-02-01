package com.zantaclaus;

public class Stock {
    public String symbol = "";
    public String name = "";
    public double previousClosingPrice  = 0.0;
    public double currentPrice  = 0.0;
    public double percent = 0.0;

    Stock() {}

    public void getSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void getCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void getChangePercent() {
        percent = (currentPrice - previousClosingPrice)/previousClosingPrice;
    }

}
