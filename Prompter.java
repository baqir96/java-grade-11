/** 
* prompter
* Muhammad Baqir
* Apr/17/13
*/ 
import java.util.Scanner;
public class Prompter {
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
   int numbermax, numbermin, numbermiddle;
   System.out.println("Enter a max value: ");
   numbermax = scan.nextInt();
   System.out.println("Enter a min value: ");
   numbermin = scan.nextInt();
   System.out.println("Enter a number that is between these two numbers: " + numbermax + " " + numbermin);
   numbermiddle = scan.nextInt();
   while ( numbermiddle > numbermax || numbermiddle < numbermin)
{
  
   System.out.println("Entera number between the two values please");
   break;
}
}
}
   