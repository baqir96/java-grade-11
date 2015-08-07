/** 
* Displays the wind speed based on the category of the hurricane 
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
public class Hurricane
{ public static void main ( String[] args ){
  int category;
  String message = ("Category is");
  Scanner scan = new Scanner( System.in );
  System.out.print("Enter a hurricane category: ");
  category = scan.nextInt();
  switch ( category ){
   case '1':
      message = message + " 74-95 mph or 64-82 kts or 119-153 km/hr" ;
      break;
   case '2':
      message = message + " 96-110 mph or 83-95 kts or 154-177 km/hr" ;
      break; 
   case '3':
      message = message + " 111-130 mph or 96-113 kts or 178-209 km/hr" ;
      break; 
   case '4':
      message = message + " 131-155 mph or 114-135 kts or 210-249 km/hr" ;
      break; 
    default:
      message = message + " greater than 155mph or 135 kts or 249 km/hr" ;
     }
  System.out.println(message + " and the hurricane category is " + category );
 }
}
      