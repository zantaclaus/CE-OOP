package com.zantaclaus;

public class Main {

    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 Perimeter : " + polygon1.getPerimeter());
        System.out.println("Polygon 1 Area : " + polygon1.getArea());

        System.out.println("Polygon 2 Perimeter : " + polygon2.getPerimeter());
        System.out.println("Polygon 2 Area : " + polygon2.getArea());

        System.out.println("Polygon 3 Perimeter : " + polygon3.getPerimeter());
        System.out.println("Polygon 3 Area : " + polygon3.getArea());
    }
}
