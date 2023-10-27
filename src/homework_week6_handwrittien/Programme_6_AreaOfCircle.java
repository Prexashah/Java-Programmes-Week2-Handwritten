package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    /**
     * write a programme to enter any radius value of the circle and find out the area. (formula of area A=PI *r*r).
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        scanner.close();
    }

    // calculating the area of circle//
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);

        System.out.println("The area of the Circle is :" + area);
    }
}


