/** 
*asks the number of tools and their total price 
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class Orderchecker
{      public static void main ( String[] args ){
  int bolt, nut, washer, numbolts, numnuts, numwasher, total, equationbolt, equationnuts, equationwasher;
  bolt = 5;
  nut = 3;
  washer = 1;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the number of bolts:");
  numbolts = scan.nextInt();
  System.out.println("Enter the number of nuts:");
  numnuts = scan.nextInt();
  System.out.println("Enter the number of washer:");
  numwasher = scan.nextInt();
  equationbolt = bolt * numbolts;
  equationnuts = nut * numnuts;
  equationwasher = washer * numwasher;
  if( numbolts > numnuts);
       System.out.println("Check the Order");
  total = (equationbolt + equationnuts + equationwasher);
  System.out.println ("Total : " + total);
 }
}
  