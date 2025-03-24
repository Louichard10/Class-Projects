import java.util.Scanner;

public class APT6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Please enter the value for x:");

        double x = Integer.parseInt(input.nextLine());

        
        double term1 = 5 * Math.pow(x, 2) + 4;

        double term2 = 9 * term1;

        double term3 = (6 * x - 2) / 3;

        double term4 = (9 / 8) * term2;

        double y = term4 - term3;

        System.out.println("y = " + y);
    }
 }
