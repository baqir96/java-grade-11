/** 
* Write a program that simulates the rolling of two dice. First, roll the first 
die once. Then, roll the second die and count how many 
rolls it took the second die to get the same value as the first die. 
* Muhammad Baqir
* Apr/26/13
*/ 
import java.util.Scanner;
public class Rollingadouble {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int random, random2, count;
  random = (int) (6* Math.random() + 1); 
  random2 = (int) (6* Math.random() + 1);
  count = 1;
  System.out.println("first die:" + " You rolled a " + random);
  System.out.println("second die:" + " You rolled a " + random2);
  while ( random2 != random)
   {
  count = count + 1;
  random2 = (int) (6* Math.random() + 1);
  System.out.println("second die:" + " You rolled a " + random2);
   } 
  System.out.println( "You rolled " + count + " times to roll a " + random + " again");
}
}