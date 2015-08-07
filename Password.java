/** 
* Asks the user for a correct password and checks if it is correct in 3 tries
* Muhammad Baqir
* Apr/19/13
*/ 
import java.util.Scanner;
public class Password {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  String a = "cool";
  String guess;
  int count = 1;
  do {
  count = count + 1;
  System.out.println("Enter the password: ");
  guess = scan.nextLine();
  if (guess.equals("cool")){
    break;
  }
  System.out.println("The password you entered is incorrect ");
  }
  while (count <= 3);
  if (guess.equals("cool")){
    System.out.print("Welcome ");
  }
  else{
    System.out.print("Access Denied ");
  }
}
}
  

