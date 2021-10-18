package trees.chaleenges.base;

import trees.chaleenges.data.GenericNode;

public class GenericQueue<T> {

  private GenericNode<T> front;
  private GenericNode<T> back;

  public void enQueue(T data) {
    if (isEmpty()) {
      GenericNode<T> node = new GenericNode<>(data);
      front = node;
      back = node;
    } else {
      GenericNode<T> node = new GenericNode<>(data);
      back.setNext(node);
      back = node;
    }
  }

  public T deQueue() {
    if (isEmpty()) {
      return null;
    } else {
      T data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public T peek() {
    return front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }

  public GenericNode<T> getFront() {
    return front;
  }

  public void setFront(GenericNode<T> front) {
    this.front = front;
  }

  public GenericNode<T> getBack() {
    return back;
  }

  public void setBack(GenericNode<T> back) {
    this.back = back;
  }
}
