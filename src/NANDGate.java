// NAND Gate (Feb.18.2025)
import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean a, b, c = false;

        System.out.println("Please enter your a value [true/false]");
        a = keyboard.nextBoolean();
        System.out.println("Please enter your b value [true/false]");
        b = keyboard.nextBoolean();
        keyboard.close();

        c = !(a && b);
        System.out.println("The NAND value of c is:" + c);
    }
}
