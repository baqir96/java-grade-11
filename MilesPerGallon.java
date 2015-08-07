/* Muhammad Baqir
 * Apr/23/13
 *Password
 * Asks the user for a password and then tells them incorrect or correct 
 * After three uncorrect tries the user is denied access
**/
 import java.util. Scanner;
class MilesPerGallon
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner (System.in);
    String real = "cool";
    String guess;
    int count = 1;
    do {
      System.out.println("Enter the password");
      guess= scan.nextLine();
      count = count + 1;
      if (guess.equals("cool")){
        break;
      }
      else {
          System.out.println("Keep Trying");}
    }
    while (guess != real && count <= 3);
    {
      if (guess.equals("cool"))
      {
       System.out.println("You got it");
      } 
      else {
       System.out.println("Access Denied");
      } 
    }
}
}