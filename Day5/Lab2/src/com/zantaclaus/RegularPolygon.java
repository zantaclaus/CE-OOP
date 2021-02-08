package com.zantaclaus;

public class RegularPolygon {
    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    RegularPolygon() {}

    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n)) ;
    }


}
