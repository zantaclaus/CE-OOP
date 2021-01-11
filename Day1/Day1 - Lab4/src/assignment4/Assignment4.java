package assignment4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        Double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        Double height = scanner.nextDouble();
        
        weight *= 0.45359237; // pound -> kg
        height *= 0.0254;     // inshe -> meter
        
        Double BMI = weight/(height * height);
        System.out.println("BMI is " + BMI);
    }
    
}
