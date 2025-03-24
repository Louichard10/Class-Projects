import java.util.Scanner;
import java.util.Random;
   public class Assignment4 { 
      public static void main(String[] agrs){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a maximum number:");
        
        int maxNum = input.nextInt();

        Random generater = new Random();
        
        int num1 = generater.nextInt(maxNum + 1);
        
        System.out.println("The random number is: " + num1);
      
      }
   
   }