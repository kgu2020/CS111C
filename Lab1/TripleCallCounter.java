/**
* Ken Gu
* Lab 1
* java version "1.8.0_241", MacOS 10.15.6
*/

/**
* main()
* @param args Command line argument.
* @return void
* Used to pass a hardcoded parameters to solveTripleCounter().
*/
class TripleCallCounter{
  public static void main(String[] args) {
    System.out.println(solveTripleCounter(-2)); //Prints the value returned by solveTripleCounter()
  }

  /**
  * Method computes the recursive sequence T(n) = T(n-1) + T(1) + T(n-1)
  * @param num An integer
  * @return An integer. Returns -1 if num < 0.
  * The non-recursive definition is T(n) = (2^n)-1. This
  * can be seen with a table comparing n and T(n).
  */
  public static int solveTripleCounter(int num){
    if(num >= 0){
      if(num == 0 || num == 1){
        return num;
      }
      else{
        return solveTripleCounter(num - 1)
        + solveTripleCounter(1)
        + solveTripleCounter(num - 1);
      }
    }
    else{
      return -1;
    }
  }
}
