import java.util.Random;
import java.util.Scanner;
   public class APT14 {
   public static void main (String[] args){
    Scanner input = new Scanner(System.in);
     Random random = new Random();
       
           
     System.out.println("Welcome to rolling dice.");
        System.out.println("Enter \"start\" to begin the game.");
        String starter = input.nextLine();
        
         if (starter.equals("start")) {
            int user = random.nextInt(6) + 1;
            int cpu = random.nextInt(6) + 1;
                
        System.out.println("You rolled a " + user + ".");
            System.out.println("The computer rolled a " + cpu + ".");
            
             if (user > cpu) {
                System.out.println("You win!");
            } else if (user < cpu) {
                System.out.println("The computer wins.");
            } else {
                System.out.println("It's a draw.");
            }
        } else {
            System.out.println("Invalid input. Please enter \"start\" to begin the game.");
        }



       
   
     }
   }