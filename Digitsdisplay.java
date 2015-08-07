/** 
*Displays the digits place holder
* Muhammad Baqir
* Mar/20/13
*/ 
import java.util.Scanner;
public class Digitsdisplay {
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
   String number;
   int index = 0;
   System.out.println("Enter a postive interger: ");
   number = scan.nextLine(); 
   int length = number.length();
   while (index < length)
   {
   System.out.println (number.charAt(index));
   index = index +1;
   }
   System.out.println( "Done with the loop" );    
  }  
}  
  
