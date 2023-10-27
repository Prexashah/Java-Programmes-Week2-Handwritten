package homework_week6_handwrittien;

import java.util.Scanner;

public class Programme_7_TempConversion {
    /**
     * Write a programme to insert any temperature value in degree Fahrenheit
     * and covert to degree Celsius ((F - 32) X 5/9 = 0C)
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();
        //object creation//
        Programme_7_TempConversion t = new Programme_7_TempConversion();

        t.covertTempToDegreeCelsius(temp);
        scanner.close();


    }

    //Temperature conversion method//
    public void covertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " Degree celsius ");
    }
}
