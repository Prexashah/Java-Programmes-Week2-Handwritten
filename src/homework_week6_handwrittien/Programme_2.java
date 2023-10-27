package homework_week6_handwrittien;

public class Programme_2 {
    /**
     * Declare two static variables.
     * Declare one static method
     * call both static variables into the static method inside the print statment.
     * Declare the main method
     * call the static method into the main method and run the programme.
     */
//declare two static method//
    static int a = 100;
    static int b = 200;

    //declare static method//
    //call both static variables into the static method inside the print statment//
    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}

