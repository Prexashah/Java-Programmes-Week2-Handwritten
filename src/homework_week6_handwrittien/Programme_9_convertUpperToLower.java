package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_9_convertUpperToLower {

    public static void main(String[] args) {
        //Scanner declaration fir reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper case string");
        String uppercase = scanner.nextLine();
        Programme_9_convertUpperToLower t = new Programme_9_convertUpperToLower();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object.//
        scanner.close();
    }

    //conversion of the Uppercase to Lower case method//
    public void convertUppercaseToLowerCase(String text) {

        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }
}