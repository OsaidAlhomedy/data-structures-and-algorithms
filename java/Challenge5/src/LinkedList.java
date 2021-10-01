import java.util.Objects;

public class LinkedList {

  private Node head;
  private int size = 0;

  public int size() {
    return size;
  }

  public void insert(String value) {

    Node newNode = new Node(value);

    if (size == 0) {
      head = newNode;
    }
    else {

      Node current = head;
      while(current.getNext() != null){
        current = current.getNext();
      }
      current.setNext(newNode);

    }
    size++;

  }

  public boolean includes(String value) {

    if(size != 0){
      Node current = head;
      while(current != null){
        if(Objects.equals(current.getData(), value)){
          return true;
        }
        current = current.getNext();
      }

    }

    return false;
  }

  @Override
  public String toString() {
    StringBuilder stringPrint = new StringBuilder();
    if(size == 0){
      return "The list is empty";
    }else{

      Node current = head;
      while (current != null){
        stringPrint.append("{ ").append(current.getData()).append(" }").append(" --> ");
        current = current.getNext();
      }
      stringPrint.append("NULL");
    }
    return stringPrint.toString();
  }

}
