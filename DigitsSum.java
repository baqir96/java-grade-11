/** 
* Create a DigitsSum application that prompts the user for a non-negative integer and 
displays the sum of the digits. 
* Muhammad Baqir
* Apr/22/13
*/ 
import java.util.Scanner;
public class DigitsSum {
public static void main (String [] args){
Scanner scan = new Scanner( System.in );
String num;
char d =' ';
System.out.println("Enter a postive integer: ");
   num = scan.nextLine();
    
   int total = 0;
   int limit = num.length();
   int count = 0;
   int value;
   
   while (count < limit){
     d = num.charAt(count);
     value = Integer.parseInt(d+"");
     total = total + value;
     count = count + 1;
   }
  System.out.println("The sum of the digits is: " + total); 
}
}
   