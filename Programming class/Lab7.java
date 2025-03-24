import java.util.Scanner;
 
 public class Lab7{
   public static void main (String[] args){
 
 Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter the temperature in kelvin:");
      
       double Kelvin = input.nextDouble();
         double fahrenheit = (Kelvin - 273.15) * 9.0 / 5.0 + 32;
      

        System.out.println(Kelvin + " degrees Kelvin is equivalent to " + fahrenheit + " degrees Fahrenheit");


 if (fahrenheit < 32) {
            System.out.println("Freeze warning");
        } else if (fahrenheit > 90) {
            System.out.println("Heat advisory");
        } else {
            System.out.println("Nice weather");
        }

    
   }
 }