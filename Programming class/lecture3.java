import java.util.Scanner;

public class lecture3 {
	   public static void main (String[] args){
	     
        //Create a Scanner to read from console
         Scanner input = new Scanner(System.in);
        
         //Prompt the User
         System.out.println(" what is your name?");
         //Read a string from the console
         String name = input.nextLine();
      
         //Prompt the User
         System.out.println("What is you age?");
         // Read an integer from the console
         int age = Integer.parseInt(input.nextLine());
         
         System.out.println("Please enter the current temp:");
         double fahrenheit = Double.parseDouble(input.nextLine());
         
         
         int birthYear = 2024 - age;
         
         double celsius = (fahrenheit - 32) * 5/9;
         
         System.out.println(fahrenheit + " degress fahrenheit is " + celsius + " degrees celsius");
	      	     
	   }
	}
