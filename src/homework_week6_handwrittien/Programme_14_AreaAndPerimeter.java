package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {
    /**
     * Write a Java program to print the are and perimeter of rectangle.
     * Test Data:
     * width = 5.5 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    //calculating area and perimeter of rectangle
    public static void areaPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        //scanner declaration for reading input form console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rectangle");
        int height = scanner.nextInt();
        System.out.println("Enter the height of the rectangle : ");
        int width = scanner.nextInt();
        areaPerimeterOfRectangle(height, width);
        //closing the scanner//
        scanner.close();

    }
}
