import java.util.Scanner;
  
   public class Lab5 {
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);

 System.out.println("Enter the latitude of coordinate 1");
 
 double x1 = Double.parseDouble(input.nextLine());

 System. out.println("Enter the longitude of coordinate 1");
 
 double y1 = Double.parseDouble(input.nextLine());

 System.out. println("Enter the latitude of coordinate 2");
 
 double x2 = Double.parseDouble(input.nextLine());

 System.out.println("Enter the longitude of coordinate 2");

 double y2 = Double.parseDouble(input.nextLine());

 double radius = 6371.01;

 double answer = radius * Math.asin(Math.sin(x1) * Math.sin(x2) + Math.cos(x2) * Math.cos(y1-y2));

 System.out.println("The distance between those points is:" + answer + "km");
   }
 }