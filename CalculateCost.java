/** 
*Calculates total cost of an item by adding the tax 
* Muhammad Baqir
* Mar/4/13
*/ 
import java.util.Scanner;
 class CalculateCost  {    
    public static void main ( String[] args )    { 
      double totalcost;
      double taxpst;
      double taxgst;
      double cost;
      Scanner scan=new Scanner( System.in );
      System.out.println("Enter the cost before taxes:");
      cost=scan.nextDouble();
      taxpst=(cost * 0.08);
      taxgst=(cost * 0.07);
      totalcost=(taxgst+taxpst+cost); 
      System.out.println("The total cost is:" + totalcost);
      
      
      
      
      
      
      
    }}