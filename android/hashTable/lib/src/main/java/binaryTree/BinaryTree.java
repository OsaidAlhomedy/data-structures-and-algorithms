package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {

  public BinaryNode<Integer> root;
  List<T> content;

  public BinaryTree() {
    this.root = null;
    this.content = new ArrayList<>();
  }

  public List<T> inOrder(BinaryNode<T> node) {
    if (node != null) {
      inOrder(node.left);
      this.content.add(node.data);
      inOrder(node.right);
    }
    return content;
  }

  public List<T> preOrder(BinaryNode<T> node) {
    if (node == null) {
      return null;
    }
    this.content.add(node.data);
    preOrder(node.left);
    preOrder(node.right);
    return content;
  }

  public List<T> postOrder(BinaryNode<T> node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      this.content.add(node.data);
    }
    return content;
  }
}
