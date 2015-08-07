/** 
*displays the correct numbers  
* Muhammad Baqir
* Apr/15/13
*/ 
import java.util.Scanner;
class Numbers
{  
  public static void main (String[] args ) {  
    Scanner scan = new Scanner( System.in );      
    int count, limit;        
    System.out.print( "Enter the starting value: " );      
    count = scan.nextInt();        
    System.out.print( "Enter the ending value: " );      
    limit = scan.nextInt();        
    System.out.println("The numbers between " + count + " and " + limit + " are: ");
    while ( count <= limit )  
    {        
      System.out.println( count );        
      count = count + 1;      
    }      
    System.out.println( "Done with the loop" );    
  }  
}  