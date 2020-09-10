/**
* Ken Gu
* Lab 1
* java version "1.8.0_241", MacOS 10.15.6
*/


public class Towers{
  /**
  * main()
  * @param args Commandline argument.
  * @return void
  * Used to pass parameters to towerOfHanoi().
  */
  public static void main(String[] args) {
    towerOfHanoi(6, 'A', 'C', 'B');
  }
  /**
  * Method to display necessary moves to complete the Towers of Hanoi game.
  * @param disk An integer; amount of disks.
  * @param source Name of the starting tower.
  * @param target Name of goal tower.
  * @param spare Name of the rmaining tower.
  */
  public static void towerOfHanoi(int disk, char source, char target, char spare){
    if(disk == 1){
      System.out.println("Move top disk from "+source+" to "+target);
    }
    else{
      towerOfHanoi(disk - 1, source, spare, target); // All disks on spare when finished
      towerOfHanoi(1, source, target, spare); // Bottom disk to target
      towerOfHanoi(disk - 1, spare, target, source); // All disks from spare to target when finished.
    }
  }
}
