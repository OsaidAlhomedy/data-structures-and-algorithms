package linked.list.challenges;

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
    } else {

      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);

    }
    size++;

  }


  public boolean includes(String value) {

    if (size != 0) {
      Node current = head;
      while (current != null) {
        if (Objects.equals(current.getData(), value)) {
          return true;
        }
        current = current.getNext();
      }

    }

    return false;
  }


  public void append(String value) {
    Node newNode = new Node(value);

    if (size == 0) {
      head = newNode;
    } else {

      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);

    }
    size++;
  }


  public void insertBefore(String value, String newValue) {

    if (includes(value)) {
      Node newNode = new Node(newValue);
      Node current = head;
      Node previous = head;
      while (!Objects.equals(previous.getNext().getData(), value)) {
        previous = previous.getNext();
      }
      current = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(current);
      size++;

    }


  }


  public void insertAfter(String value, String newValue) {

    if (includes(value)) {
      Node newNode = new Node(newValue);
      Node current = head;
      Node previous = head;
      while (!Objects.equals(previous.getData(), value)) {
        previous = previous.getNext();
      }
      current = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(current);
      size++;

    }


  }

  public String kthFromEnd(int k) throws IndexOutOfBoundsException {

    if (k >= 0 && k <= this.size - 1) {
      Node current = head;
      int counter = 0;
      int finder = this.size() - 1 - k;

      while (counter < finder) {
        current = current.getNext();
        counter++;
      }
      return current.getData();

    } else {
      throw new IndexOutOfBoundsException("you're out of bounds my man");
    }
  }

  public Node getHead() {
    return head;
  }

  public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {

    if (list1.size() == 0 && list2.size() == 0) {
      throw new Exception("Your Lists are empty");
    } else if (list2.size() == 0) {
      return list1;
    } else if (list1.size() == 0) {
      return list2;
    } else {

      Node c1 = list1.getHead();
      Node c2 = list2.getHead();
      Node t1, t2;


      while (c1.getNext() != null && c2 != null) {

        t1 = c1.getNext();
        t2 = c2.getNext();

        c1.setNext(c2);
        c2.setNext(t1);

        c1 = t1;
        c2 = t2;

        list1.size ++;

        if (c1.getNext() == null) {
          c1.setNext(c2);
          break;
        }

      }

      return list1;

    }


  }

  @Override
  public String toString() {
    StringBuilder stringPrint = new StringBuilder();
    stringPrint.append("head --> ");
    if (size == 0) {
      return "The list is empty";
    } else {

      Node current = head;
      while (current != null) {
        stringPrint.append("[ ").append(current.getData()).append(" ]").append(" --> ");
        current = current.getNext();
      }
      stringPrint.append("X");
    }
    return stringPrint.toString();
  }
}
