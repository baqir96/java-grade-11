/** 
* Dicerools
* Displays five rolls of two dice
* Muhammad Baqir
* Apr/19/13
*/ 
import java.util.Scanner;
public class Dicerolls {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int random, random2, equation, count;
  System.out.print("Dice 1 ");
  System.out.print(" Dice 2 ");
  System.out.println(" Total ");
  
  for ( count = 0;  count < 5; count++ )
  {
  random = (int) (6* Math.random() + 1);
  random2 = (int) (6* Math.random() + 1); 
  equation = random + random2; 
  System.out.print( random + "       ");
  System.out.print( random2 + "      ");
  System.out.print( equation + "     ");
  System.out.println( "    ");
  }
  System.out.print("Done with program");
}
}
  