/** 
*Converts Gallons to litres
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
 class GallontoLitres  {    
    public static void main ( String[] args )    { 
      double conversion;
      double Gallons;
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter Gallons:");
      Gallons = scan.nextDouble();
      conversion = (Gallons*3.78);
      System.out.println("The litres are: "+ conversion);
      
    }}