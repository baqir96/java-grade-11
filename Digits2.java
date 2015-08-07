/** 
*Displays the digits place holder
* Muhammad Baqir
* Mar/20/13
*/ 
import java.util.Scanner;
public class Digits2 {
public static void main (String [] args){
  int num, onedigit, seconddigit, thirddigit;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter three digit number: ");
  num = scan.nextInt();
  onedigit=(num/100);
  seconddigit=(num/10)%10;
  thirddigit=(num%10);
  System.out.println("The hundreds-place is " + onedigit);
  System.out.println("The tens-place digit is " + seconddigit);
  System.out.println("The ones-place is " + thirddigit);
        
}}
  