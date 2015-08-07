/** 
*Displays a random number between a min and a max number  
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class Randomnum
{ public static void main ( String[] args ){
  int minum, maxnum;
  Scanner scan = new Scanner( System.in );
  System.out.print("Enter a min value: ");
  minum = scan.nextInt();
  System.out.print("Enter a max value: ");
  maxnum = scan.nextInt();
  System.out.println ("The number between " + minum + " and " + maxnum + " is: " + (int)((maxnum - minum + 1)*Math.random()+minum)); 
   }
}