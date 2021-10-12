package stack.and.queue.challenges.base;

import stack.and.queue.challenges.data.GenericNode;

public class GenericStack<T> {

  private GenericNode<T> top;

  public void push(T data) {
    if (isEmpty()) {
      top = new GenericNode<>(data);
    } else {
      GenericNode<T> node = new GenericNode<>(data);
      node.setNext(top);
      top = node;
    }
  }

  public T pop() {
    if (isEmpty()) {
      return null;
    } else {
      T data = top.getData();
      top = top.getNext();
      return data;
    }
  }

  public T peek() {
    if (isEmpty()) {
      return null;
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

  public GenericNode<T> getTop() {
    return top;
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top +
      '}';
  }

}
