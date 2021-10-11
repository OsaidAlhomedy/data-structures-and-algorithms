package stack.and.queue.challenges;

import stack.and.queue.challenges.data.Node;

public class Animal {

  private String type;

  public Animal(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return type;
  }
}
