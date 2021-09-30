public class LinkedList {

  private Node head;
  private int size = 0;

  public void insert(String value) {
    Node current = head;
    Node newNode = new Node(value);
    if (size == 0) {
      this.head = newNode;
    } else {
      this.head = newNode;
    }
    size++;

  }

  public int size() {
    return size;
  }

  public boolean includes(String value) {


    return false;
  }


}
