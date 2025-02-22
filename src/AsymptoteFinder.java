// Asymptote Finder (Feb.21.2025)
import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the degree of a rational polynomial's numerator (m): ");
        int m = keyboard.nextInt();
        System.out.println("Please enter the degree of a rational polynomial's numerator (m): ");
        int n = keyboard.nextInt();
        keyboard.close();

        if (m == n) {
            System.out.println("The asymptote is horizontal.");
        } else if (m < n) {
            System.out.println("The asymptote is the x-axis.");
        } else if (m > n) {
            switch (m - n) {
                case 1:
                    System.out.println("The asymptote is linear.");
                    break;
                case 2:
                    System.out.println("The asymptote is quadratic.");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic.");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic.");
                    break;
                case 5:
                    System.out.println("The asymptote is quintic.");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic.");
                    break;
                case 7:
                    System.out.println("The asymptote is septic.");
                    break;
                case 8:
                    System.out.println("The asymptote is octic.");
                    break;
                case 9:
                    System.out.println("The asymptote is nonic.");
                    break;
                case 10:
                    System.out.println("The asymptote is decic.");
                    break;
                default:
                    System.out.println("N/A");
                    break;
            }
        }
    }
}