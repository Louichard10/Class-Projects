import java.util.Scanner;
  
   public class LAB3 {
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      double T1 = 0.0;
      double T2 = 0.0;
      double M = 0.0;
      
      System.out.println("Enter the amount of water in kilograms:");
      M = Double.parseDouble(input.nextLine());
      
      System.out.println("Enter the initial temperature:");
      
      T1 = Double.parseDouble(input.nextLine());
      
      System.out.println("Enter the final final temperature:");
      
      T2 = Double.parseDouble(input.nextLine());
      
         double Q = M * (T2-T1) * 4184;
         
         System.out.println("\nThe energy needed is: " + Q + " Joules");
      
      }
   }