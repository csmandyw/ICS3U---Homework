// Boolean Test (Feb.19.2025)
import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
       
        System.out.println("Please enter an A value");
        boolean A = keyboard.nextBoolean();
        System.out.println("Please enter an B value");
        boolean B = keyboard.nextBoolean();
        System.out.println("Please enter an C value");
        boolean C = keyboard.nextBoolean();
        System.out.println("Please enter an D value");
        boolean D = keyboard.nextBoolean();
        keyboard.close();

        boolean output = ((A && B) || (C && D)) || ((A && C) || (A && D)) || ((B && D) || (B && C));
        System.out.println("The output value is " + output);
    }
}