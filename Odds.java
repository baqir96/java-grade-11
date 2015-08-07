/** 
* Displays all the sum of all odd numbers 
* Muhammad Baqir
* Apr/17/13
*/ 
import java.util.Scanner;
public class Odds {
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
   int number, num, total;
   System.out.println("Enter a postive number: ");
   number = scan.nextInt();
   num = 1;
   total = 0;
   while ( num <= number){
     total = total + num;
     num = num + 2;
   }
     System.out.println("The sum of all the odd numbers up to " + number + " is: " + total);
   }
}

