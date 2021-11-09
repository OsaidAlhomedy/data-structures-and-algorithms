import binaryTree.BinaryNode;
import binaryTree.BinaryTree;
import hashTable.base.HashTable;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    BinaryTree<Integer> tree1 = new BinaryTree<>();
    BinaryTree<Integer> tree2 = new BinaryTree<>();

    tree1.root = new BinaryNode<>(150);
    tree1.root.left = new BinaryNode<>(100);
    tree1.root.right = new BinaryNode<>(250);

    tree1.root.left.left = new BinaryNode<>(75);
    tree1.root.left.right = new BinaryNode<>(160);

    tree1.root.left.right.left = new BinaryNode<>(125);
    tree1.root.left.right.right = new BinaryNode<>(175);

    tree1.root.right.left.left = new BinaryNode<>(200);
    tree1.root.right.left.right = new BinaryNode<>(350);

    tree1.root.right.right.left = new BinaryNode<>(300);
    tree1.root.right.right.right = new BinaryNode<>(500);


    tree2.root = new BinaryNode<Integer>(42);
    tree2.root.left = new BinaryNode<>(100);
    tree2.root.right = new BinaryNode<>(600);

    tree2.root.left.left = new BinaryNode<>(15);
    tree2.root.left.right = new BinaryNode<>(160);

    tree2.root.left.right.left = new BinaryNode<>(125);
    tree2.root.left.right.right = new BinaryNode<>(175);

    tree2.root.right.left = new BinaryNode<>(200);
    tree2.root.right.right = new BinaryNode<>(350);

    tree2.root.right.right.left = new BinaryNode<>(4);
    tree2.root.right.right.right = new BinaryNode<>(500);


    System.out.println(treeIntersection(tree1, tree2));

  }

  public static List<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2) {
    if (tree1.root == null && tree2.root == null) {
      return new ArrayList<>();
    } else if (tree1.root != null && tree2.root == null) {
      return new ArrayList<>();
    } else if (tree1.root == null && tree2.root != null) {
      return new ArrayList<>();
    }
    HashTable<Integer, Integer> table = new HashTable<>();
    List<Integer> common = new ArrayList<>();
    for (int item : tree1.preOrder(tree1.root)) {
      table.add(item, 0);
    }
    List<Integer> list = tree2.inOrder(tree2.root);
    for (int item : list) {
      if (table.contains(item)) {
        common.add(list.get(list.indexOf(item)));
      } else {
        table.add(list.get(list.indexOf(item)), 0);
      }
    }
    return common;
  }


}
