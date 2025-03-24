import java.util.Random;
 public class Lap4P2 {
   public static void main (String[] args){
    Random generater = new Random();
    
    int a = generater.nextInt(50 + 1);
    int b = generater.nextInt(50 + 1);
    double c = Math.sqrt(a * a + b * b);
    
    System.out.println("Random a: " + a);
    System.out.println("Random b: " + b); 
    System.out.println("Length of c: " + c);  
   }
 }