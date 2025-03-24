import java.util.Scanner;

public class APT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value for x:");

        double x = scanner.nextDouble();

        scanner.close();

        double term1 = 5 * Math.pow(x, 2) + 4;

        double term2 = 9 * term1;

        double term3 = (6 * x - 2) / 3.0;

        double term4 = (9.0 / 8) * term2;

        double y = term4 - term3;

        System.out.println("Intermediate values:");
        System.out.println("Term 1: " + term1);
        System.out.println("Term 2: " + term2);
        System.out.println("Term 3: " + term3);
        System.out.println("Term 4: " + term4);

        System.out.println("\nFinal result:");
        System.out.println("y = " + y);
    }
}