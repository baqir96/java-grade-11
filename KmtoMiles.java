/** 
*Converts km to miles 
* Muhammad Baqir
* Mar/4/13
*/ 
 import java.util.Scanner;
 class KmtoMiles  {    
    public static void main ( String[] args )    { 
      double convertion;
      double Km;
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter the Km:");
      Km = scan.nextDouble();
      convertion = (Km/1.61);
      System.out.println("The miles are: "+ convertion); 
      
      
      
  }}