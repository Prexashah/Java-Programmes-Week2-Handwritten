package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_19_ConvertStringToLowercase {
    /**
     * Write a Java program to convert a given string into lowercase.
     * Sample input: THE QUICk BROWN FOX OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form onsole//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowercase t = new Programme_19_ConvertStringToLowercase();
        t.convertStringToLowerCase(uppercase);
        scanner.close();


    }

    //convert string to lower case//
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }

}

