// NAND Gate (Feb.18.2025)

import java.util.Scanner;
public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean cValue = false;     
        
        System.out.println("Please enter your  a value[true/false]");
        a= keyboard.next().charAt(0);
        System.out.println("Please enter your b value[/]");
        b = keyboard.next().charAt(0);
        keyboard.close();

        boolean cValue = !(a && b == 1)

    }
}
