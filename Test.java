/** 
*test 2 program 
* Muhammad Baqir
* Apr/6/13
*/ 
import java.util.Scanner;
public class Test 
{ public static void main ( String[] args ){  
  int seat;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the seat number: ");
  seat = scan.nextInt();
   if ( seat >= 100 && seat <= 159){
  System.out.println( "Your section is A and the ticket price is $150");
  } else if ( seat >= 160 && seat <= 199){
  System.out.println( "Your section is B and the ticket price is $125");
  } else if ( seat >= 200 && seat <= 259){
  System.out.println( "Your section is C and the ticket price is $100");
  } else if ( seat >= 260 && seat <= 299){
  System.out.println( "Your section is D and the ticket price is $90");
  } else if ( seat >= 300 && seat <= 325){
  System.out.println( "Your section is E and the ticket price is $75");
  } else if ( seat >= 326 && seat <= 349){
  System.out.println( "Your section is F and the ticket price is $60");
  } else if ( seat >= 350 && seat <= 399){
  System.out.println( "Your section is G and the ticket price is $50");
  } else if ( seat >= 400 && seat <= 459){
  System.out.println( "Your section is H and the ticket price is $40");
  } else if ( seat >= 460 && seat <= 499){
  System.out.println( "Your section is I and the ticket price is $25");
  } else {
  System.out.println ("Not a seat number!");
  }}
}
    