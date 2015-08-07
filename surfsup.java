/** 
*Tells the user if the the waves are higher enough for surfing  
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class surfsup
{      public static void main ( String[] args ){
  int height;
  Scanner scan = new Scanner( System.in );
  System.out.print("How high are the waves: ");
  height = scan.nextInt();
  if( height > 6 );
       System.out.println("Great day for surfing!!!");
     
  }
}
