package homework_week6_handwrittien;

public class Programme_12_PrintExpression {
    /**
     * Write Java program to compute the specified expressions and print the output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected output : 2.13888888889
     */
    public static void main(String[] args) {
        Programme_12_PrintExpression t = new Programme_12_PrintExpression();
        t.printExpressions();
    }


//Printing expression//
    public void printExpressions() {
double a = ((25.5 * 3.5 - 3.5 * 3.5)  /   (40.5 - 4.5));
        System.out.println(a);
    }
}