# Graphs

<!-- Short summary or background information -->

A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially
connected by line segments named edges.

## Challenge

<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach is slicing the implementation to small logical block of codes then implementing and testing them

Time Complexity : O(n)
Space Complexity : O(n^2)

## API

<!-- Description of each method publicly available in your Graph -->

- addNode(T value) : this method adds a new node to the graph
- addEdge(T value1,T value2) : this method adds a new edge between 2 nodes using their values as parameters
- getNodes() : this method returns a list of all the nodes in the graph
- getNeighbors(T value) : this method returns a list of the neighbor nodes to the passed node value
- size() : returns the number of nodes in the graph
