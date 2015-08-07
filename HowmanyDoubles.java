/** 
* Modify the die program so it rolls both 
* dice 500 times. Count the number of times each value occurred.
* Muhammad Baqir
* Apr/26/13
*/ 
import java.util.Scanner;
public class HowmanyDoubles{
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int random, random2, count, countone, counttwo, countthree, countfour, countfive, countsix;
  count = 0;
  countone = 0;
  counttwo = 0;
  countthree = 0;
  countfour = 0;
  countfive = 0;
  countsix = 0;
  while ( count < 500)
   {
  count = count +1;
  random = (int) (6* Math.random() + 1); 
  random2 = (int) (6* Math.random() + 1);
  if ( random == 1 && random2 == 1){
    countone = countone + 1;
  } else if ( random == 2 && random2 == 2){
    counttwo = counttwo + 1;
  } else if ( random == 3 && random2 == 3){
    countthree = countthree + 1;
  } else if ( random == 4 && random2 == 4){
    countfour = countfour + 1;
  } else if ( random == 5 && random2 == 5){
    countfive = countfive + 1;
  } else if ( random == 6 && random2 == 6){
    countsix = countsix + 1;
  } else {
  }
  } 
  System.out.println( "Your rolled double 1's " + countone + " times " );
  System.out.println( "Your rolled double 2's " + counttwo + " times " );
  System.out.println( "Your rolled double 3's " + countthree + " times " );
  System.out.println( "Your rolled double 4's " + countfour + " times " );
  System.out.println( "Your rolled double 5's " + countfive + " times " );
  System.out.println( "Your rolled double 6's " + countsix + " times " );
  System.out.println( "You rolled " + count + " times");
  }
}