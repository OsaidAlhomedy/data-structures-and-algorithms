package trees.chaleenges.base;

import trees.chaleenges.data.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class BinaryTree<T extends Comparable<T>> {

  protected Node<T> root;


  public static List<Integer> breadthFirst(BinaryTree<Integer> tree) {

    List<Integer> list = new ArrayList<>();
    Queue<Node<Integer>> queue = new LinkedList<>();

    queue.add(tree.root);

    while (!queue.isEmpty()) {

      Node<Integer> temp = queue.remove();
      list.add(temp.getData());

      if (temp.getLeft() != null) {
        queue.add(temp.getLeft());
      }

      if (temp.getRight() != null) {
        queue.add(temp.getRight());
      }
    }

    return list;

  }

  private static void breadthFirstHelper(Node<Integer> current, List<Integer> list) {


  }

  /////////////////////////////////

  public List<T> preOrder() {
    if (isEmpty()) {
      return null;
    }
    List<T> list = new ArrayList<>();
    preOrderHelper(root, list);
    return list;
  }

  public List<T> inOrder() {
    if (isEmpty()) {
      return null;
    }
    List<T> list = new ArrayList<>();
    inOrderHelper(root, list);
    return list;
  }

  public List<T> postOrder() {
    if (isEmpty()) {
      return null;
    }
    List<T> list = new ArrayList<>();
    postOrderHelper(root, list);
    return list;
  }

  public int max() {
    List<T> list = preOrder();
    if (list == null) {
      return 0;
    }

    Integer maximum = 0;
    for (T integer : list) {
      if (integer.compareTo((T) maximum) > 0) {
        maximum = (Integer) integer;
      }
    }

    return maximum;
  }

  ///////////////////////////////////

  private void preOrderHelper(Node<T> rootArg, List<T> list) {

    list.add(rootArg.getData());

    if (rootArg.getLeft() != null) {
      preOrderHelper(rootArg.getLeft(), list);
    }

    if (rootArg.getRight() != null) {
      preOrderHelper(rootArg.getRight(), list);
    }
  }

  private void inOrderHelper(Node<T> rootArg, List<T> list) {

    if (rootArg.getLeft() != null) {
      inOrderHelper(rootArg.getLeft(), list);
    }

    list.add(rootArg.getData());

    if (rootArg.getRight() != null) {
      inOrderHelper(rootArg.getRight(), list);
    }
  }

  private void postOrderHelper(Node<T> rootArg, List<T> list) {


    if (rootArg.getLeft() != null) {
      postOrderHelper(rootArg.getLeft(), list);
    }

    if (rootArg.getRight() != null) {
      postOrderHelper(rootArg.getRight(), list);
    }

    list.add(rootArg.getData());
  }

  public boolean isEmpty() {
    return root == null;
  }

}
