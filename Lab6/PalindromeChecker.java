import java.util.Scanner;
public class PalindromeChecker
{
   /** Tests whether a string is a palidrome, ignoring punctuation, spaces, and case.
       @param aString  a string */
   public static boolean isPalindrome(String aString)
   {
      aString.trim();
      aString.toLowerCase();
      for (int i = 0; i < aString.length(); i++)
      {
        if (!(PalindromeChecker.isPunctuation(aString.charAt(i))))
          OurStack.push((Character)(aString.charAt(i))); //end if
      } //end for
      for (int i = 0; i < aString.length(); i++)
      {
        if ((Character)(aString.charAt(i)) == OurStack.peek())
          OurStack.pop(); //end if
      } //end for
      if (OurStack.isEmpty())
        return true; //end if
      else
        return false; //end else
   } // end isPalindrome


   /** Tests whether a character is a punctuation mark.
       If a string contains a punctuation mark character, the
       character should be ignored when trying to determine whether the
       string is a palindrome
       @param aCharacter.   a single character */
   public static boolean isPunctuation(char aCharacter)
   {
    return (aCharacter == '.') || (aCharacter == ',') || (aCharacter == '?') ||
           (aCharacter == '!') || (aCharacter == '"');
   } // end isPunctuation

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //Describe the program and how it works
      System.out.println("This program determines whether a string");
      System.out.println("is a palindrome. A palindrome is spelled");
      System.out.println("the same from left to right as it is from right to left,");
      System.out.println("if we ignore punctuation, spaces, and case.");

      System.out.print("Enter a string that you want to check (or enter ! to exit): ");
      String aString = keyboard.nextLine();

      while (!aString.equals("!"))
      {
         if (isPalindrome(aString))
            System.out.println(aString + " is a palindrome!");
         else
            System.out.println(aString + " is not a palindrome!");

         System.out.print("Enter a string that you want to check (or enter ! to exit): ");
         aString = keyboard.nextLine();
      } // end while

      System.out.println("Done!");
   } // end main
} // end PalindromeChecker
