/** 
* Tells the mulitation table for a given number
* Muhammad Baqir
* Apr/18/13
*/ 
import java.util.Scanner;
public class Multiolicationtable {
  
public static void main (String [] args){
   Scanner scan = new Scanner( System.in );
   int num, count , equation;
   count = 1;
   System.out.println("Enter a number: ");
   num = scan.nextInt();
   System.out.println("The multiplication table of " + num + " " );
   while ( count <= 10)
   {
   equation = count * num;
   System.out.println( count + " x " + num + " = " + equation);
   count = count + 1;
   }
   System.out.print("Done with loop" );
}
}