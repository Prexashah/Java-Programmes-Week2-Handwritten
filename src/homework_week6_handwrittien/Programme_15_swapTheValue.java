package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_15_swapTheValue {
    /**
     * write a Java program to swap two variables.
     */

    //swapping the value of variables
    public static void main(String[] args) {
        //scanner declaration for reading input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value");
        int first = scanner.nextInt();
        System.out.println("Enter second variable value :");
        int second = scanner.nextInt();
        Programme_15_swapTheValue t = new Programme_15_swapTheValue();
        t.swapTheValue(first, second);
        scanner.close();
    }

    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is :" + a + "And second variable is :" + b);

    }

}
