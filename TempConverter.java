/** 
*Converts temperture from celicus to fernihite  
* Muhammad Baqir
* Mar/6/13
*/ 
import java.util.Scanner;
public class TempConverter
{             public static void main ( String[] args ){
  int celsius;   
  double equation;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the temperture in celcius:");
  celsius= scan.nextInt();
  equation=celsius * 1.8 + 32;
  System.out.println("The temperture in celcius is: "+ equation);
}}