// Array Test (Mar.4.2025)

import java.util.Scanner;

public class ArayTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
       
        System.out.println("Please enter a number between 1 and 4");
        String[] menu = new String[4];
        int number = keyboard.nextInt();
        keyboard.close();
        
        if (number == 1) {
            menu[1] = "Please enter 10 strings into the array";
        } 
        menu[2] = "Below are the inputs of the array";
        menu[3] = "Choose a number between 1 and 10";
        menu[4] = "";
        
       

          

    }
}
