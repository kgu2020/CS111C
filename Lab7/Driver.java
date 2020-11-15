import java.util.Scanner;

public class Driver{
  public static void main(String[] args) {
    LinkedQueue q = new LinkedQueue();

    Scanner keyboard = new Scanner(System.in);
    //keyboard.useDelimiter(",");
    int input;

    int[] list = {1, 5, 2, 3, 10};
    for (int i = 0; i < 5; i++)
    {
      q.enqueue(list[i]);
    }
    /*
    System.out.print("Input a list of items to be placed into a queue:  ");
    while (keyboard.hasNext())
    {
      input = keyboard.next();
      q.enqueue(input);
    }

    System.out.print("Input the item that is to be move to the back: ");
    input = keyboard.nextInt();
    System.out.println();
    */
    try
    {
      q.moveToBack(list[1]);
      System.out.print("Items in queue after one item was moved to the back:  ");
      while (!q.isEmpty())
      {
        System.out.print(q.getFront() + ",");
        q.dequeue();
      }
    }
    catch (EmptyQueueException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
