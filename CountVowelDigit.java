import java.util.Scanner;

public class CountVowelDigit {
   public static void main(String[] args) {
      String inStr;
      char tempStr;        
      int inStrLen;        
      //String[] vowel = {a, e, i, o, u, A, E, I, O, U};
      int counterVowel = 0, counterDigit = 0;
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();   
      inStrLen = inStr.length();
   
      for(int i = 0; i <= (inStrLen - 1); i++){

         if((inStr.charAt(i) == 'a')||(inStr.charAt(i) == 'e')||(inStr.charAt(i) == 'i')||(inStr.charAt(i) == 'o')||(inStr.charAt(i) == 'u')){
            counterVowel ++;
         }

         if(Character.isDigit(inStr.charAt(i))){
            counterDigit ++;
         }
      }

      System.out.printf("Number of vowels is: %d (%.2f%%)%n",counterVowel,(double)100*counterVowel/inStrLen);
      System.out.printf("Number of digits is: %d (%.2f%%)%n",counterDigit,(double)100*counterDigit/inStrLen);
   }
}