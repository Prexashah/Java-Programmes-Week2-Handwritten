package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    /** write a Java program to add two binary numbers.
     * input Data:
     * Input first binary number:10
     * Input second binary number:11
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter first binary number");
        String first = scanner.nextLine();
        System.out.println("Please Enter Second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is :" + addition);
        // closing the scanner//
        scanner.close();

    }
    //adding two binary numbers//
    public static String addTwoBinaryNumbers(String first, String second){
        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);

    }
}
