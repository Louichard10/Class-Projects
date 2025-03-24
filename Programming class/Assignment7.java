import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = input.nextDouble();

        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.print("Positive ");
                if (Math.abs(number) < 1) {
                    System.out.println("Small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Large");
                }
            } else {
                System.out.print("Negative ");
                if (Math.abs(number) < 1) {
                    System.out.println("Small");
                }
            }
        }

    }
}