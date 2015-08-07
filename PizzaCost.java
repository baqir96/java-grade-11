/** 
*Displays the pizza's cost depending on the diameter of the pizza in inches
* Muhammad Baqir
* Mar/19/13
*/ 
import java.util.Scanner;
import java.text.NumberFormat;
 public class PizzaCost {
 public static void main (String [] args){
 double equation;
 double labourcost;
 int rentcost;
 double materials;
 rentcost = 1;
 labourcost = 0.75;
 Scanner scan = new Scanner( System.in );
 System.out.println("Enter the pizza size in inches:");
 materials = scan.nextDouble();
 equation = (0.05 * materials * materials) + rentcost + labourcost;
 NumberFormat money = NumberFormat.getCurrencyInstance();
 NumberFormat decimal = NumberFormat.getNumberInstance();
 System.out.println ("the cost for making the pizza is " + money.format(equation));

 }}
 
 
