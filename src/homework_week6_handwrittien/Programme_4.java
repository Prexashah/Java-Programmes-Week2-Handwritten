package homework_week6_handwrittien;

public class Programme_4 {
    /**
     * Write java programme using following steps.
     * Declare two instance and two static variables.
     * Declare one static method.
     * Call all four instance and static variables into both instance and static methods inside the print statement.
     * Declare the main method.
     * Call both instance and static methods into the main method and run the programme.
     */
    // Declare two instance and two static variables.//
    //instance variables//
    String name = "Prime";
    String Surname = "Testing";
    //static variables//
    static boolean a = true;
    static boolean b = false;

    //Declare one instance method//
    //call all four instance and static variables into both instance and static methods inside the print statement.//
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }

    //Declare one static method//
    //call all four instance and static variables into both instance and static methods inside the print statement.//
    public static void staticMethod() {
        Programme_4 programme_4 = new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }

    //Declare main method//
    //call both instance and static methods into the Main method and run the programme.//
    public static void main(String[] args) {
        Programme_4 programme_4 = new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }

}

