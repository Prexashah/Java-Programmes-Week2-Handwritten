package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    /**
     * Write a program to calculate the area of a triangle.//
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of triangle : ");
        int length = scanner.nextInt();
        System.out.println("Enter the height of the triangle :");
        int height = scanner.nextInt();
        areOfTriable(height, length);
        scanner.close();

    }

    //calculation for are of triangle with no return type with parameter method//
    public static void areOfTriable(int  length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of Triangle is : " + area);
    }

}
