/**
* Ken Gu
* Lab 1
* java version "1.8.0_241", MacOS 10.15.6
*/
public class Towers{
  public static void main(String[] args) {
    towerOfHanoi(6, 'A', 'C', 'B');
  }

  public static void towerOfHanoi(int disk, char source, char target, char spare){
    if(disk == 1){
      System.out.println("Move top disk from "+source+" to "+target);
    }
    else{
      towerOfHanoi(disk - 1, source, spare, target);
      towerOfHanoi(1, source, target, spare);
      towerOfHanoi(disk - 1, spare, target, source);
    }
  }
}
