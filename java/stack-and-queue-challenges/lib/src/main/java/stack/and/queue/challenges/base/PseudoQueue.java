package stack.and.queue.challenges.base;

public class PseudoQueue {

  private Stack stack1 = new Stack();
  private Stack stack2 = new Stack();


  public void enQueue(String data) {
    stack1.push(data);
  }

  public String deQueue() {
    while(stack1.getTop() != null){
      stack2.push(stack1.pop());
    }
    String value = stack2.pop();
    while(stack2.getTop() != null){
      stack1.push(stack2.pop());
    }
    return value;
  }

  @Override
  public String toString() {
    return "PseudoQueue{" +
      "stack1=" + stack1 +
      '}';
  }
}
