import java.util.Random;

   public class APT7 {
   public static void main (String[] args) {
   
   Random random = new Random();
   
   double number = 2000 + random.nextDouble() * 1000;
   
   System.out.println("The random number is " + number);
   
   
      }
   }