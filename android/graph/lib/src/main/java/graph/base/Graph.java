package graph.base;

import graph.data.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph<T> {

  HashMap<T, GraphNode<T>> nodes = new HashMap<>();
  HashMap<GraphNode<T>, List<GraphNode<T>>> adjList = new HashMap<>();
  private int size = 0;

  public GraphNode<T> addNode(T data) {
    int localSize = nodes.size();

    GraphNode<T> node = new GraphNode<>(data);
    adjList.putIfAbsent(node, new ArrayList<>());
    nodes.putIfAbsent(data, node);

    if (localSize != nodes.size()) {
      size++;
    }

    return node;
  }

  public void addEdge(T from, T to) {
    GraphNode<T> fromNode = nodes.get(from);
    if (fromNode == null) throw new IllegalArgumentException();

    GraphNode<T> toNode = nodes.get(to);
    if (toNode == null) throw new IllegalArgumentException();

    if (fromNode == toNode) {
      adjList.get(fromNode).add(toNode);
    } else if (!adjList.get(fromNode).contains(toNode) && !adjList.get(toNode).contains(fromNode)) {
      adjList.get(fromNode).add(toNode);
      adjList.get(toNode).add(fromNode);
    }
  }

  public List<GraphNode<T>> getNodes() {
    List<GraphNode<T>> list = new ArrayList<>(nodes.values());
    if (list.isEmpty()) return null;
    return list;
  }

  public List<GraphNode<T>> getNeighbors(T data) {
    GraphNode<T> requiredNode = nodes.get(data);
    return adjList.get(requiredNode);
  }

  public int size() {
    return size;
  }

}