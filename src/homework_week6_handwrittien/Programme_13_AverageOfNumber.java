package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_13_AverageOfNumber {
    /** Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {
        //scanner declaration for reading input form console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your  first number ");
        double x = scanner.nextByte();
        System.out.println("Enter your second number");
        double y = scanner.nextDouble();
        System.out.println("Enter your third number");
        double z = scanner.nextDouble();
        scanner.close();
        averageOfThreeNumbers(x,y,z);
    }


//Calculation of average of three numbers//
public static void averageOfThreeNumbers(double a , double b, double c){
    double average = (a + b + c) / 3;
    System.out.println("The average of " + a + " ,  " +  b +  " and "  +  c  + "  is  : " + average );

}
}