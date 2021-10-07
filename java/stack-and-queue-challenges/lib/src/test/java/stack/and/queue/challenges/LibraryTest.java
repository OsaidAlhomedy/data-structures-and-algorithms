/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue.challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.and.queue.challenges.base.Queue;
import stack.and.queue.challenges.base.Stack;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  @DisplayName("This test is for the stacks")
  @Test
  void stackTesting() {

    // testing the isEmpty Method
    Stack osaidStack = new Stack();
    assertTrue(osaidStack.isEmpty());
    assertEquals("The stack is empty", osaidStack.pop());

    // testing the push Method
    osaidStack.push("osaid");
    osaidStack.push("Sad");


    assertEquals("Sad", osaidStack.peek());
    assertFalse(osaidStack.isEmpty());

    // testing the pop Method
    assertEquals("Sad",osaidStack.pop());
    assertEquals("osaid", osaidStack.peek());

  }


  @DisplayName("This test is for the queue")
  @Test
  void queueTesting() {

    // testing the isEmpty Method
    Queue osaidQueue = new Queue();
    assertTrue(osaidQueue.isEmpty());
    assertEquals("Queue is empty", osaidQueue.deQueue());

    // testing the enQueue Method
    osaidQueue.enQueue("osaid");
    osaidQueue.enQueue("Sad");


    assertEquals("osaid", osaidQueue.peek());
    assertFalse(osaidQueue.isEmpty());

    // testing the deQueue Method
    assertEquals("osaid",osaidQueue.deQueue());
    assertEquals("Sad", osaidQueue.peek());


  }
}