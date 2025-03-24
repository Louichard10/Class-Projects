import java.util.Scanner;
   public class Tem {
	   public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Please enter the temp in fahrenheit");
         
          double fahrenheit = Double.parseDouble(input.nextLine());
         
          double celsius = (fahrenheit - 32) * 5.0/9;
          
          System.out.println(fahrenheit + " degress in fahrenheit is " + celsius + " degrees celsius");


   }
}