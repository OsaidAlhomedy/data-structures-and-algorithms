# Trees

<!-- Short summary or background information -->

Trees are a data structure that made of nodes, each node has its own maximum number of children nodes which is K.

Binary search trees are rooted binary trees data structure which internal nodes each store a key greater than all the keys in the node’s left subtree and less than those in its right subtree.

## Challenge

<!-- Description of the challenge -->

New Implementations :

- Nodes
- Binary Trees
- Binary Search Trees

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The approach is simple we compare the node data and add nodes to the tree based on if the data is larger (to the right node) or smaller(to the left node) than the data of the current node

## API

<!-- Description of each method publicly available in each of your trees -->

- BinarySearchTree.add() => This api is used to add a new node to the tree in the correct location

- BinarySearchTree.contain() => This api is used to search for data inside the tree and returns a boolean indicating whether the data is in the tree or not.