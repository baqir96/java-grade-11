/** 
*Adds the facebook friends to your patry list   
* Muhammad Baqir
* Apr/14/13
*/ 
import java.util.Scanner;
class FaceBook
{  
  public static void main (String[] args )   
  {   
    Scanner scan = new Scanner (System.in);
    String friendID = "";    
    String message = "Hi ";    
    int count;
    count = 1;             
    while ( count <= 5)  
    {
    System.out.println("Enter ID" + count);      
    friendID = scan.nextLine();
    message = message + " " + friendID;      
    count = count + 1;
    }    
  System.out.println( message + " " + "..." );
  System.out.println("Party on friday!");
  }
}
