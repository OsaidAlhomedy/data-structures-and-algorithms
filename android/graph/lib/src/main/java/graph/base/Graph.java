package graph.base;

import graph.data.GraphNode;

import java.util.*;

public class Graph<T, W> {

  HashMap<T, GraphNode<T, W>> nodes = new HashMap<>();
  HashMap<GraphNode<T, W>, List<GraphNode<T, W>>> adjList = new HashMap<>();
  private int size = 0;

  public static String businessTrip(Graph<String, Integer> graph, List<String> list) {
    String string;
    int sum = 0;

    for (int i = 0; i < list.size() - 1; i++) {

      GraphNode<String, Integer> current = graph.getSpecificNode(list.get(i));
      if (current == null) return "Node is not present in the graph";

      GraphNode<String, Integer> neighbor = graph.getSpecificNode(list.get(i + 1));
      if (graph.getNeighbors(list.get(i)).contains(neighbor)) {
        sum += neighbor.getWeight().get(list.get(i));
      } else {
        string = "False , " + "$" + 0;
        return string;
      }
    }

    string = "True , " + "$" + sum;
    return string;
  }

  public GraphNode<T, W> addNode(T data) {
    int localSize = nodes.size();

    GraphNode<T, W> node = new GraphNode<>(data);
    adjList.putIfAbsent(node, new ArrayList<>());
    nodes.putIfAbsent(data, node);

    if (localSize != nodes.size()) {
      size++;
    }

    return node;
  }

  public void addEdge(T from, T to) {
    GraphNode<T, W> fromNode = nodes.get(from);
    if (fromNode == null) throw new IllegalArgumentException();

    GraphNode<T, W> toNode = nodes.get(to);
    if (toNode == null) throw new IllegalArgumentException();

    if (fromNode == toNode) {
      adjList.get(fromNode).add(toNode);
    } else if (!adjList.get(fromNode).contains(toNode) && !adjList.get(toNode).contains(fromNode)) {
      adjList.get(fromNode).add(toNode);
      adjList.get(toNode).add(fromNode);
    }
  }

  public void addEdge(T from, T to, W weight) {
    GraphNode<T, W> fromNode = nodes.get(from);
    if (fromNode == null) throw new IllegalArgumentException();

    GraphNode<T, W> toNode = nodes.get(to);
    if (toNode == null) throw new IllegalArgumentException();

    if (fromNode == toNode) {
      adjList.get(fromNode).add(toNode);
      fromNode.getWeight().put(to, weight);
    } else if (!adjList.get(fromNode).contains(toNode) && !adjList.get(toNode).contains(fromNode)) {
      adjList.get(fromNode).add(toNode);
      adjList.get(toNode).add(fromNode);
      fromNode.getWeight().put(to, weight);
      toNode.getWeight().put(from, weight);
    }
  }

  public List<GraphNode<T, W>> getNodes() {
    List<GraphNode<T, W>> list = new ArrayList<>(nodes.values());
    if (list.isEmpty()) return null;
    return list;
  }

  public GraphNode<T, W> getSpecificNode(T data) {
    return nodes.get(data);
  }

  public List<GraphNode<T, W>> getNeighbors(T data) {
    GraphNode<T, W> requiredNode = nodes.get(data);
    return adjList.get(requiredNode);
  }

  public int size() {
    return size;
  }

  public List<T> breadthFirst(T data) {

    GraphNode<T, W> graphNode = nodes.get(data);
    if (graphNode == null) {
      throw new IllegalArgumentException();
    }

    Set<GraphNode<T, W>> visited = new HashSet<>();
    Queue<GraphNode<T, W>> queue = new LinkedList<>();
    List<T> printList = new ArrayList<>();

    queue.add(graphNode);

    while (!queue.isEmpty()) {
      GraphNode<T, W> current = queue.remove();

      if (visited.contains(current)) {
        continue;
      }
      printList.add(current.getData());
      visited.add(current);

      for (GraphNode<T, W> node : adjList.get(current)) {
        if (!visited.contains(node)) queue.add(node);
      }
    }
    return printList;
  }


  public List<T> depthFirst(T data) {

    GraphNode<T, W> graphNode = nodes.get(data);
    if (graphNode == null) {
      throw new IllegalArgumentException();
    }
    Stack<GraphNode<T, W>> stack = new Stack<>();
    Set<GraphNode<T, W>> visited = new HashSet<>();
    List<T> printList = new ArrayList<>();

    stack.push(graphNode);

    while (!stack.isEmpty()) {
      GraphNode<T, W> current = stack.pop();

      if (visited.contains(current)) {
        continue;
      }

      printList.add(current.getData());
      visited.add(current);

      for (GraphNode<T, W> node : adjList.get(current)) {
        if (!visited.contains(node)) stack.push(node);
      }
    }
    return printList;

  }

}
