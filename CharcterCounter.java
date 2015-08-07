/** 
* Calculates the vowels in a sentence
* Muhammad Baqir
* Apr/25/13
*/ 
import java.util.Scanner;
public class CharcterCounter {
public static void main (String [] args){
  Scanner scan = new Scanner( System.in );
  System.out.println("Enter some text: ");
  String sentence = scan.nextLine().toLowerCase();
  int numvowel, numpunctuation, numspaces, numconsonants;
  numvowel = 0;
  numpunctuation = 0;
  numspaces = 0;
  numconsonants = 0;
  for ( int count = 0; count < sentence.length (); count++){
    char info = (sentence.charAt(count));
    if ((sentence.charAt(count)== 'a') || (sentence.charAt(count) == 'e') ||(sentence.charAt(count) == 'i')||(sentence.charAt(count) == 'o')||(sentence.charAt(count) == 'u')){
   numvowel++;
}
else if ((sentence.charAt(count) == '.') || (sentence.charAt(count) == '!') || (sentence.charAt(count) == '?') || (sentence.charAt(count) == '?')){
    numpunctuation++;
}
else if (info ==' '){
  numspaces++;
}
else {
               numconsonants++;
               }
  }
System.out.println("The # of vowels: " + numvowel);
System.out.println("The # of spaces: " + numspaces);
System.out.println("The # of puntuation: " + numpunctuation);
System.out.println("The # of consontants: " + numconsonants);
}
}

