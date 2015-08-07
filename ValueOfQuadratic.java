/** 
*Displays the value of the quadritic 
* Muhammad Baqir
* Feb/25/13
*/ 
public class ValueOfQuadratic
{             
  public static void main ( String[] args )
  { 
  double x;
  Scanner scan = new Scanner (System.in);
  System.out.println("Enter the x value: ");
  x = scan.nextDouble();
  double equation;
  equation= 3 * (x*x) - 8 * x + 4;
  System.out.println("At X =" + x + " the value is " + equation);
}
}