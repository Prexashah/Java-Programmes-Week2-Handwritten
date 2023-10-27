package homework_week6_handwrittien;

public class Programme_1 {
    /**
     * write a Java programme using the following steps.
     * 1.1Declare two instance variables.
     * 1.2Declare one instance method
     * call both instance variables into the instance method inside the print statment.
     * Declare the main method
     * Call above instance method into the Main method and run the programme.
     */
//Declare two instance variable//
    int a = 10;
    int b = 20;
    //Declare one instance method//
    //call both instance variables into the instance method inside the print statement.//

    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Programme_1 programme_1 = new Programme_1();
        programme_1.instanceMethod();
    }

}