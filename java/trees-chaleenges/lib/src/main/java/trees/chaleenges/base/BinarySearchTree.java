package trees.chaleenges.base;

import trees.chaleenges.data.Node;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements Comparable<BinarySearchTree<T>> {

  private boolean validator = false;

  public void add(T input) {

    if (isEmpty()) {
      root = new Node<>(input);
    } else {
      addHelper(input, root);
    }

  }

  private void addHelper(T input, Node<T> node) {

    Node<T> nodeBinary = new Node<>(input);

    if (input.compareTo(node.getData()) < 0) {

      if (node.getLeft() == null)
        node.setLeft(nodeBinary);
      else
        addHelper(input, node.getLeft());

    }

    if (input.compareTo(node.getData()) > 0) {

      if (node.getRight() == null)
        node.setRight(nodeBinary);
      else
        addHelper(input, node.getRight());

    }


  }

  public boolean contains(T input) {
    containsHelper(input, root);
    return validator;
  }

  private void containsHelper(T input, Node<T> node) {

    if (node.getData() == input) {
      this.validator = true;
    }

    if (node.getLeft() != null) {
      containsHelper(input, node.getLeft());
    }

    if (node.getRight() != null) {
      containsHelper(input, node.getRight());
    }
  }

  public Node<T> getRoot() {
    return root;
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      '}';
  }

  @Override
  public int compareTo(BinarySearchTree<T> tBinarySearchTree) {
    return 0;
  }
}
