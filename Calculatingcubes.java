/** 
* Calculates the cube of numbers 
* Muhammad Baqir
* Apr/19/13
*/ 
import java.util.Scanner;
public class Calculatingcubes {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int count, equation;
  count = 1;
  while ( count <= 12)
   {
   equation = count * count * count;
   System.out.println("The cube of " + count + " is " + equation);
   count = count + 1;
   }
   System.out.print("Done with loop" );
}
}