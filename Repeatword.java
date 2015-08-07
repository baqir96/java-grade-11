/** 
*Repeats a word depending ton the word size
* Muhammad Baqir
* Apr/14/13
*/ 
import java.util.Scanner;
class Repeatword{  
  public static void main (String[] args ){
    String word;
    int wordlength;
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a word");      
    word = scan.nextLine();
    wordlength = word.length();
    int count = 1;
    while ( count <= wordlength)  
    {
      System.out.println(word);
      count = count + 1;
    }
  }
}
    