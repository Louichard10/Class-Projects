import java.util.Scanner;

public class APT3 {
	   public static void main (String[] args){
	      
         // Create a Scanner object to take input from the user
         Scanner input = new Scanner(System.in);
         
         // Tell the user to input the first number
         System.out.println("Input first number");
         // Read the first number
         int num1 = Integer.parseInt(input.nextLine());
         
         // Tell the user to input the second number
         System.out.println("Input second number");
         // Read the first number
	      int num2 = Integer.parseInt(input.nextLine());
         
          // Calculate the create of the two numbers
         int create = num1 * num2;
         
         System.out.println(num1 + " x " + num2 + " = " + create);

	   }
	}
