/**
* Ken Gu
* Lab 1
* java version "1.8.0_241", MacOS 10.15.6
*/


class CountUp{
  /**
  * main()
  * @param args Commandline argument.
  * @return void
  * Used to pass parameters to countUp().
  */
  public static void main(String[] args) {
    countUp(5);
  }

  /**
  * Method prints integers from 0 up to parameter.
  * @param n An integer.
  * @return void.
  * Head recursion method to print increasing integers.
  */
  public static void countUp(int n){
    if(n >= 0){ //executes for [0,n]
      countUp(n - 1); // puts calls on stack.
      System.out.println(n); // executes after base case evaluated.
    }
  }
}
