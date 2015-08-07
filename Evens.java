/** 
*Displays the even numbers between 1 and number entered by user 
* Muhammad Baqir
* Apr/17/13
*/ 
import java.util.Scanner;
public class Evens {
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
   int number , display;
   System.out.println("Enter a postive number: ");
   number = scan.nextInt();
   display = 2; 
  System.out.println("the even numbers between 1 and " + number+ "are: " );
   while ( display < number )
   {
   System.out.print( display + ",");
   display = display + 2; 
   }
   System.out.println();
   System.out.println( "Done with the loop" );
   
   }
}

