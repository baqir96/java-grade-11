/** 
*Calculates the circle's area by the given radius value from the user 
* Muhammad Baqir
* Mar/4/13
*/ 

import java.util.Scanner;
public class CircleCircumference
{             public static void main ( String[] args ){
      double area;
      double radius;
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter the radius of the circle:");
      radius = scan.nextDouble();
      area = (Math.PI * (radius * radius));
      if ( radius < 0){
      System.out.println( "Negative radii are illegal.");
      }
  else{                   
     System.out.println("Total area of circle: "+ area);
  }
}
}