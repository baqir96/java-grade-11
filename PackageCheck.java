/** 
*If the delivery service can accept packages 
* Muhammad Baqir
* Apr/6/13
*/ 
import java.util.Scanner;
public class PackageCheck
{ public static void main ( String[] args ){
  int weight, lenght, height, width;
  int equationcubric;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the weight of the object in kilograms: ");
  weight = scan.nextInt();
  System.out.println("Enter the lenght in centimeters: ");
  lenght = scan.nextInt();
  System.out.println("Enter the height in centimeters: ");
  height = scan.nextInt();
  System.out.println("Enter the width in centimeters: ");
  width = scan.nextInt();
  equationcubric = lenght * height * width;
  if ( weight > 27 && equationcubric > 100000){
  System.out.println( "Too large and heavy"); 
  } else if ( weight > 27){
  System.out.println( "Too heavy");
  } else if ( equationcubric > 100000){
  System.out.println( "Too large");
  } else {
  System.out.println ("Clear");
  }}
}