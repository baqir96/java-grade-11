/** 
*Users guess the number genratered by the computer 
* Muhammad Baqir
* Apr/4/13
*/ 
import java.util.Scanner;
public class Guessinggame{
public static void main ( String[] args ){
  int guess;
  int num1 = (int)(20*Math.random()+1);
  Scanner scan = new Scanner( System.in );
  System.out.print("Enter a number between 1 and 20: ");
  guess = scan.nextInt();
  System.out.println("Computers number: " + num1);
  System.out.println("Players number: " + guess);
  if (guess == num1){
  System.out.println( "Correct");
    }
else{                   
    System.out.println("Better luck next time");
}
 }
}