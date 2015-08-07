/** 
* Displays the correct guess
* Muhammad Baqir
* Apr/17/13
*/ 
import java.util.Scanner;
public class Guessinggamegame {
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
  int guess;
  int number = 1;
  int num1 = (int)(20*Math.random()+1);
  System.out.print("Enter a number between 1 and 20: ");
  guess = scan.nextInt();
  do {
  if (guess > num1){
  System.out.println("Too high");
    }
else{                   
    System.out.println( " Too low");
}
  number = number + 1;
  System.out.print("Enter a number between 1 and 20: ");
  guess = scan.nextInt();
  } while (guess!=num1 && number <= 5);
  System.out.println ("You Guessed it!!! " + num1 + " was the secret number");
  }
}
    
    