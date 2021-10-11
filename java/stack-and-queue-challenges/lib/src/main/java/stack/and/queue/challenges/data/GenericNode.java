package stack.and.queue.challenges.data;

public class GenericNode<T> {

  private T data; // the data
  private GenericNode<T> next;   // the reference


  public GenericNode(T data) {
    this.data = data;
  }


  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public GenericNode<T> getNext() {
    return next;
  }

  public void setNext(GenericNode<T> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data='" + data + '\'' +
      '}';
  }
}
