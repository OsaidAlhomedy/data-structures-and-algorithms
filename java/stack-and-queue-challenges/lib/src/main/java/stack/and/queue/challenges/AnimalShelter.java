package stack.and.queue.challenges;


import stack.and.queue.challenges.base.GenericQueue;
import stack.and.queue.challenges.data.GenericNode;

import java.util.Locale;
import java.util.Objects;

public class AnimalShelter<T> extends GenericQueue<T> {

  @Override
  public void enQueue(T data) {
    if (isEmpty()) {
      GenericNode<T> node = new GenericNode<>(data);
      setFront(node);
      setBack(node);
    } else {
      GenericNode<T> node = new GenericNode<>(data);
      getBack().setNext(node);
      setBack(node);
    }
  }

  @Override
  public T deQueue(String type) {
    type = type.toLowerCase(Locale.ROOT);

    if (isEmpty()) {
      return null;
    } else {
      T data = getFront().getData();
      if (Objects.equals(((Animal) data).getType(), "cat") && Objects.equals(type, "cat")) {
        setFront(getFront().getNext());
        return data;
      } else if (Objects.equals(((Animal) data).getType(), "dog") && Objects.equals(type, "dog")) {
        setFront(getFront().getNext());
        return data;
      } else {
        setFront(getFront().getNext());
        return null;
      }
    }
  }
}
