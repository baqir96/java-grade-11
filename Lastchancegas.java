/** 
*Calculates if you have enough gas left to make it arcoss death vally  
* Muhammad Baqir
* Mar/19/13
*/ 
import java.util.Scanner;
public class Lastchancegas {
public static void main (String [] args){
  int tankcap, mpg;
  double gasleft, enoughgas, percent; 
  Scanner scan = new Scanner( System.in );
  System.out.println("What is the gastank capicity in gallons of your car:");
  tankcap = scan.nextInt();
  System.out.println("How many quarters of the gas tank do you have left");
  percent = scan.nextInt();
  System.out.println("What is the mpg of your car");
  mpg = scan.nextInt();
  gasleft = tankcap * (percent/100);
  System.out.println("Gage reading " + percent);
  enoughgas = gasleft * mpg;
  if (enoughgas < 200) 
  System.out.println("Get Gas!");
  else 
  System.out.println("Enjoy your trip acroos death vally!");
}

}

  