/** 
*Displays an equation and asks the user for an answer and checks it
* Muhammad Baqir
* Apr/4/13
*/ 
import java.util.Scanner;
public class MathTutor
{ public static void main ( String[] args ){
  int equation, equation2 ,equation3, equation4;
  int answer;
  int num1 = (int)(10*Math.random()+1); 
  int num2 = (int)(10*Math.random()+1); 
  String operater ;
  int num3 = (int)(4*Math.random()+1);
  switch ( num3 ){
   case 1:
      operater = "+" ;
      break;
   case 2:
      operater = "-" ;
      break; 
   case 3:
      operater = "/" ;
      break; 
    default:
      operater = "*" ; 
     } 
 System.out.println ("What is " + num1 + " " + operater + " " + num2 );
 Scanner scan = new Scanner( System.in );
 System.out.print("Enter your answer: ");
 answer = scan.nextInt();
 equation = num1 + num2;
 equation2 = num1 * num2;
 equation3 = num1 / num2;
 equation4 = num1 - num2;
 if (answer == equation){
        System.out.println ("You are correct");
  } else if (answer == equation2){
      System.out.println ("You are correct");
  } else if (answer == equation3){
       System.out.println ("You are correct");
  } else if (answer == equation4){
       System.out.println ("You are correct");
  } else {
       System.out.println ("Wrong");
  }
 }
}
