/** 
*Tells the user if the the waves are higher enough for surfing  
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class surfsuppart3
{      public static void main ( String[] args ){
  int height;
  Scanner scan = new Scanner( System.in );
  height = scan.nextInt();
  if (height >= 6){
  System.out.println( "Great day for surfing!");
  } else if ( height < 3){
  System.out.println( "Go body boarding!");
} else {
  System.out.println ("Go for a swim!");
}}
}
    
      