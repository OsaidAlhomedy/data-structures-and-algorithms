public class Node {

  private String data; // the data
  private Node next;   // the reference


  public Node(String data) {
    this.data = data;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
