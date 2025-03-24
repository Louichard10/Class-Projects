import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("What is the length of the rectangle:");
        
        int length = Integer.parseInt(input.nextLine());
        
        
        System.out.println("What is the width of the rectangle:");
        
        int width = Integer.parseInt(input.nextLine());

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
   }
}