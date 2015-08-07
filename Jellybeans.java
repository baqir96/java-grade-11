/** 
* Calculates the jelly beans 
* Muhammad Baqir
* Apr/26/13
*/ 
import java.util.Scanner;
public class Jellybeans {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int equation, equation2;
  int jellybean = 231;
  int day = 1;
  while ( jellybean > 0 ) 
  {
   System.out.println("Day " + day + " :" + jellybean + " jellybeans ");
    day = day + 1;
    equation = day%3;
    equation2 = day%5;
    if (equation == 0) {
      jellybean = jellybean - 6; 
    }
    if (equation2 == 0) {
       jellybean = jellybean + 8;
    }
    else {
            }
}
 System.out.println("Finished with Jellybeans after " + day + " days ");
}
}
      
    