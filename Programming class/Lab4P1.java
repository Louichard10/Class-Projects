import java.util.Random;
   public class Lab4P1 { 
    public static void main(String[] args){
      Random generater = new Random();
      
      int num1 = generater.nextInt(100 + 1) + 100;
      int num2 = generater.nextInt(100 + 1) + 0;
      System.out.println("The randomly generated maximum number: " + num1);
      System.out.println("The randomly number is: " + num2);
    }
   }