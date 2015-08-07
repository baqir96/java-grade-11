/** 
*Displays the total cost of the order based on entered values 
* Muhammad Baqir
* Mar/19/13
*/ 
import java.text.NumberFormat;
import java.util.Scanner;
public class Order {
public static void main (String [] args){
  double burgercost, burgers, friescost, fries, sodacost, sodas, equationfries, equationsodas, equationburgers, total, tax, totaltax, amount, moneyback;
  burgercost = 1.69;
  friescost = 1.09;
  sodacost = 0.99;
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter the number of sodas:");
  sodas = scan.nextDouble();
  System.out.println("Enter the number of burgers:");
  burgers = scan.nextDouble();
  System.out.println("Enter the number of fries:");
  fries = scan.nextDouble();
  equationfries = friescost * fries;
  equationsodas = sodacost * sodas;
  equationburgers = burgers * burgercost;
  total = equationburgers + equationsodas + equationfries;
  tax = total * 0.065;
  totaltax = tax + total;
  NumberFormat money = NumberFormat.getCurrencyInstance();
  System.out.println ("Total before tax: " + money.format(total));
  System.out.println ("Tax is: " + money.format(tax));
  System.out.println ("Final Total: " + money.format(totaltax));
  System.out.println("Enter amount tendered:"); amount = scan.nextDouble();
  moneyback = (amount - totaltax);
  System.out.println("Change: " + money.format(moneyback));
}}