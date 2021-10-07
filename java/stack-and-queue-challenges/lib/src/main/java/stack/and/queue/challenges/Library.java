package stack.and.queue.challenges;

import stack.and.queue.challenges.base.Queue;
import stack.and.queue.challenges.base.Stack;

public class Library {

  public static void main(String[] args) {



    Queue osaidQueue = new Queue();
    osaidQueue.enQueue("Killing");
    osaidQueue.enQueue("In");
    osaidQueue.enQueue("The");
    osaidQueue.enQueue("Name");
    osaidQueue.enQueue("Of");

    System.out.println(osaidQueue.isEmpty());


  }
}
