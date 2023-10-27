package homework_week6_handwrittien;

public class Programme_3 {
    /**
     * Write a Java programme using the following steps.
     * Declare one instance and one static variable.
     * Declare one instance method.
     * Declare one static method
     * Call both instance and static variables into both instance and static methods inside the print statement.
     * Declare the main method.
     * Call both instance and static methods into the main method and run the programme.
     */
    //Declare one instance and one static variable.//
    String name = "Prime";
    static String surname = "Testing";

    //Declare one instance method//
    //call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }

    //Declare one static method//
    //Call both instance and static variables int hto both instance and static method//
    public static void staticMethod() {
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //Declare main method and call both variable into the main method//
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }
}
