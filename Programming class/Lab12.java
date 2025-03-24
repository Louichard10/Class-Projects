import java.util.Random;
import java.util.Scanner;
   public class Lab12{
   public static void main(String[] args){
   Random random = new Random();
   Scanner input = new Scanner(System.in);

   
   int Rain = random.nextInt(2);

        if (Rain == 1) {
            System.out.println("It is raining outside.");

           
            System.out.println("Do you have an umbrella? (0 for no, 1 for yes)");
            int response = input.nextInt();

            
            switch (response) {
                case 0:
                    System.out.println("You're going to regret not having an umbrella!");
                    break;
                case 1:
                    System.out.println("Smart thinking!");
                    break;
                default:
                    System.out.println("Invalid response.");
            }
        }       else {
            System.out.println("It is not raining outside.");
        }

        }


      }
