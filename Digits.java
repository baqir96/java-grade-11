/** 
*Displays the Digits place 
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class Digits
{        public static void main ( String[] args ){
      int num, onedigit, seconddigit;
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter a two digit number:");
      num = scan.nextInt();
      onedigit=(num%10);
      seconddigit=(num/10);
      System.out.println("The first digit is " + onedigit);
      System.out.println("The second digit is " + seconddigit);
      
      
      
      
}}