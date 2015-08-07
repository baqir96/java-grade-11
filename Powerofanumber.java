/** 
* Calculates the power of a number
* Muhammad Baqir
* Apr/19/13
*/ 
import java.util.Scanner;
public class Powerofanumber {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  double n;
  double x;
  for ( n = 0; n >=0;  )
  {
  System.out.print("Enter X: ");
  x = scan.nextDouble();
  System.out.print("Enter N: ");
  n = scan.nextInt();
          if ( n <= 0)
          {
          break;
          }
  System.out.println( x + "raised to the power " + n + " is: " + Math.pow(x,n));
   }
System.out.print("N must be a postive number");
}
}