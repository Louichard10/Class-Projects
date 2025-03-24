 import java.util.Random;
 
 public class APT9 {
 public static void main(String[] args){
   
  Random generater = new Random();
  
  double radius = generater.nextDouble(90 + 1) + 10;
   double circumference = 2 * Math.PI * radius;
   System.out.println("Radius:" + radius);
   System.out.println("Circumference: " + circumference);

 
 }
}