/** 
*Displays the totle distance but asks the user before for distances
* Muhammad Baqir
* Mar/4/13
*/ 

import java.util.Scanner;
public class DistanceandScanner
{             public static void main ( String[] args ){               
      double distance;
      double fristpart;
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter the distance of the frist part of the race:");
      fristpart = scan.nextDouble();
      double secondpart;
      System.out.println("Enter the distance of the second part of the race:");
      secondpart = scan.nextDouble();
      double thirdpart;
      System.out.println("Enter the distance of the third part of the race:");
      thirdpart = scan.nextDouble();
      distance= fristpart+secondpart+thirdpart; 
      System.out.println("Total distance of race: "+ distance);                   
    }     
}   




    
  
      
  