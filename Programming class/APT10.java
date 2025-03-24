import java.util.Scanner;
public class APT10{  
   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Input a string:");
      
      String s1 = input.nextLine();
      
      int lastIndex = s1.length() - 1;
      
      char lastChar = s1.charAt(lastIndex);
     
      System.out.println("Last character: " +  lastChar);
       
         }  
    }