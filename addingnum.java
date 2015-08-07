/** 
* adds all the numbers within a range and outside the range
* Muhammad Baqir
* Apr/19/13
*/ 
import java.util.Scanner;
public class Inrangeadder {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  int lowrange, highrange, sumin, sumout, data;
  System.out.print("Low end of range: ");
  lowrange = scan.nextInt();
  System.out.print("High end of range: ");
  highrange = scan.nextInt();
  sumout= 0;
  sumin = 0;
  data = 1;
  while ( data > 0) 
  { 
  System.out.print("Enter data: ");
  data  = scan.nextInt();
    if ( data >= lowrange && data <= highrange){
      sumin = sumin + data;}
    else { 
      sumout = sumout + data;}
  }
  System.out.print("Sum of in range values: " + sumin);
  System.out.print("Sum of out of range values: " + sumout);
}
}
      
      