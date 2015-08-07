/** 
*Calculates the dollars and cents by the given number of cents  
* Muhammad Baqir
* Mar/6/13
*/ 
import java.util.Scanner;
public class CentstoDollars
{             public static void main ( String[] args ){
  int money;
  int equation;
  int equation2;
  Scanner scan = new Scanner( System.in );
  System.out.println("Input the cents:");
  money= scan.nextInt();
  equation= money/100;
  equation2=money%100;
  System.out.println("That is: "+ equation + " dollars and " + equation2 + " cents");
}
}