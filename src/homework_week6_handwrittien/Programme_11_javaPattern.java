package homework_week6_handwrittien;

public class Programme_11_javaPattern {
    /**
     *  Write a Java program to display the following pattern.
    Sample Pattern :
    J a v v a
    J a a v v a a
    J J aaaaa V V aaaaa
    J J a a V a a
 */
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        Programme_11_javaPattern t = new Programme_11_javaPattern();
        t.javaPattern();
    }
    //printing java pattern//
    public void javaPattern(){
        System.out.println("J  a   v    v a");
        System.out.println("J a  a  v  v a  a ");
        System.out.println("J J  aaaaa   V  V  aaaaa");
        System.out.println("J J  a   a   V  a   a ");
    }


}
