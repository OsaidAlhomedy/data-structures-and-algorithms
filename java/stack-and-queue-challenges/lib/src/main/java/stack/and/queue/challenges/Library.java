package stack.and.queue.challenges;

import stack.and.queue.challenges.base.PseudoQueue;

public class Library {

  public static void main(String[] args) {

    PseudoQueue queue = new PseudoQueue();

    queue.enQueue("20");
    queue.enQueue("15");
    queue.enQueue("10");
    queue.enQueue("5");

    System.out.println(queue);

    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue);


  }
}
