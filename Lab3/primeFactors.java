/*
* Ken Gu
* Lab 3
* java version "1.8.0_241", MacOS 10.15.6
*/
import java.util.Scanner;

public class primeFactors{
  /**
  * main()
  * @param args Commandline argument.
  * @return void
  * Used to pass parameters to showFactors().
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input;
    System.out.printf("Enter a number, "
                  + "and I will display its prime factors\n"
                  + "in ascending order;\n"
                  + "enter 0 to exit program: ");
    input = scan.nextInt();
    if(input == 0){
      System.out.println("Goodbye!");
    }
    else{
      showFactors(input);
    }
  }
  /**
  * Overloaded method to pass user input from main()
  * and a default value as 2nd parameter.
  * @param number An integer
  * @return void
  */
  public static void showFactors(int number){
    System.out.print("Factors for " + number + ": "); //String response
    showFactors(number, 2); //passes 2 as the starting prime factor.
  }
  /**
  * Recursive method to display prime factors in ascending order.
  * @param number An integer.
  * @param factor An integer 2 and above.
  * @return void
  */
  private static void showFactors(int number, int factor){
    if(number == 1){
      // The base case; Occurrs either as user input or
      // when number = factor in the elif block.
      System.out.println();
    }
    else if(number % factor == 0){
      // Adds factor to string response
      System.out.print(factor + " ");
      // Quotient becomese new dividend.
      // This call approaches the base case since
      // number > 1 and factor is constant.
      showFactors((number / factor), factor);
    }
    else{
      // Tries the next integer as divisor.
      // This call approaches the base case since
      // factor approaches number.
      showFactors(number, factor + 1);
    }
    //
  }
  //end of primeFactors class
}
