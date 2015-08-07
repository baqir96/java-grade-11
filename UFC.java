/** 
*Asks for the fighters name and weight and places them into a class
* Muhammad Baqir
* Apr/4/13
*/ 
import java.util.Scanner;
public class UFC
{ public static void main ( String[] args ){
  int weight;
  String name;
  Scanner scan = new Scanner( System.in );
  System.out.print("Enter the fighter's name: ");
  name = scan.nextLine();
  System.out.print("Enter the Fighter's weight in lbs: ");
  weight = scan.nextInt();
  if ( 145 <= weight){
        System.out.println ( name + " can fight in the lightwight category");
  } else if (155 <= weight){
      System.out.println ( name + " can fight in the welterweight category");
  } else if (170 <= weight ){
       System.out.println ( name + " can fight in the middleweight category");
  } else if ( 185 <= weight){
       System.out.println ( name + " can fight in the light heavyweight category");
  } else if ( 205 <= weight){
       System.out.println ( name + " can fight in the heavyweight category");
  } else {
       System.out.println ( name + "cannot fight");
  }
  
  
  }
}
