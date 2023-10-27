package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    /**Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected output
     * Binary number is : 101
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input from console//
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
    }
    //convert the decimal to binary//
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is :" + binary);

    }

}
