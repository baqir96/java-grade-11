/** 
*Calculates Degrees to radians 
* Muhammad Baqir
* Mar/6/13
*/ 
import java.util.Scanner;
public class DegreesToRadians
{             public static void main ( String[] args ){
  int degree;   
  double equation;   
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the angle in degrees:");
  degree= scan.nextInt();
  equation = (double)degree * Math.PI/180;
  System.out.println("The angle in radians is: "+ equation);
  
}}