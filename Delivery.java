/** 
*Tells the user if the box gets accepted or rejected depending on the size
* Muhammad Baqir
* Apr/4/13
*/ 
import java.util.Scanner;
public class Delivery
{ public static void main ( String[] args ){
  int lenght, width, height;
  Scanner scan = new Scanner( System.in );
  System.out.print("Enter the lenght: ");
  lenght = scan.nextInt();
  System.out.print("Enter the width: ");
  width = scan.nextInt();
  System.out.print("Enter the height: ");
  height = scan.nextInt();
  if ( lenght <= 10 && width <= 10 && height <= 10)
   System.out.println( "Accept" ); 
else
   System.out.println( "Reject!" );   
 }
}