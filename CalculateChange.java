/** 
*Displays the digits place holder
* Muhammad Baqir
* Mar/20/13
*/ 
import java.util.Scanner;
public class CalculateChange{
public static void main (String [] args){
  int amount, quarters, dimes, nickels, pennies;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the change in cents: ");
  amount = scan.nextInt();
  quarters = amount/25;
  dimes = (amount%25) / 10;
  nickels = ((amount%25) % 10) /5;
  pennies = (((amount%25) % 10)%5)/1;
  System.out.println("The minimum change of coins is: ");
  System.out.println("Quarters: " + quarters); 
  System.out.println("Dimes: " + dimes);
  System.out.println("Nickels: " + nickels);
  System.out.println("pennies: " + pennies);
}}