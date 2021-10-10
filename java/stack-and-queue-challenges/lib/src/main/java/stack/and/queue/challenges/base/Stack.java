package stack.and.queue.challenges.base;

import stack.and.queue.challenges.data.Node;

public class Stack {

  private Node top;

  public void push(String data) {
    if (isEmpty()) {
      top = new Node(data);
    } else {
      Node node = new Node(data);
      node.setNext(top);
      top = node;
    }
  }

  public String pop() {
    if (isEmpty()) {
      return "The stack is empty";
    } else {
      String data = top.getData();
      top = top.getNext();
      return data;
    }
  }

  public String peek() {
    if (isEmpty()) {
      return "The stack is empty";
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

  public Node getTop() {
    return top;
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top +
      '}';
  }
}
