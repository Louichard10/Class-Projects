 import java.util.Random;
  
  public class Lecture7 { 
   public static void main (String[] args) {
   
   Random randomizer = new Random();
   
            
    double fahrenheit = randomizer.nextDouble() * 100;
    System.out.println("The random Fehrenheit is " + fahrenheit);

         
          double celsius = (fahrenheit - 32) * 5.0/9;
          
          System.out.println(fahrenheit + " degress in fahrenheit is " + celsius + " degrees celsius");



 
   }
 }