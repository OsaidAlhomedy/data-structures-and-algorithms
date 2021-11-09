package binaryTree;

public class BinaryNode<T> {
  public T data;
  public BinaryNode<T> left;
  public BinaryNode<T> right;

  public BinaryNode(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
