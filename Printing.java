/** 
*How much a printing job would cost depending on the number of copies
* Muhammad Baqir
* Apr/4/13
*/ 
import java.util.Scanner;
public class Printing 
{ public static void main ( String[] args ){
  int copies;
  double equation, equation1, equation2, equation3, equation4;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the number of copies: ");
  copies = scan.nextInt();
  equation = copies * 0.3;
  equation1 = copies * 0.28;
  equation2 = copies * 0.27;
  equation3 = copies * 0.26;
  equation4 = copies * 0.25;
  if ( copies <= 99){
        System.out.println ("Price per copy is: $0.30");
        System.out.println ("Total cost is: " + equation);
  } else if (copies <= 499){
      System.out.println ("Price per copy is: $0.28");
      System.out.println ("Total cost is: " + equation1);
  } else if (copies <= 749){
       System.out.println ("Price per copy is: $0.27");
       System.out.println ("Total cost is: " + equation2);
  } else if (copies <= 1000){
       System.out.println ("Price per copy is: $0.26");
       System.out.println ("Total cost is: " + equation3);
  } else {
       System.out.println ("Price per copy is: $0.25");
       System.out.println ("Total cost is: " + equation4);
  }
  }
}