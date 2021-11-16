/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import graph.base.Graph;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  @DisplayName("adding nodes testing")
  @Test
  void graphAddNodeTest() {
    Graph<String,Integer> graph = new Graph<>();

    // adding new nodes
    graph.addNode("osaid");
    graph.addNode("rahaf");
    graph.addNode("mohammad");
    assertEquals(3, graph.size());

    //adding existing nodes
    graph.addNode("osaid");
    graph.addNode("rahaf");
    assertEquals(3, graph.size());

  }

  @DisplayName("adding an edge between 2 nodes")
  @Test
  void graphAddEdgeTest() {
    Graph<String,Integer> graph = new Graph<>();
    graph.addNode("osaid");
    graph.addNode("rahaf");
    // adding edge testing
    graph.addEdge("osaid", "rahaf");
    assertEquals("[rahaf]", graph.getNeighbors("osaid").toString());

    // adding existing edge testing
    graph.addEdge("osaid", "rahaf");
    assertEquals("[rahaf]", graph.getNeighbors("osaid").toString());

  }

  @DisplayName("graph size test")
  @Test
  void graphSize() {
    Graph<String,Integer> graph = new Graph<>();
    // empty graph
    assertEquals(0, graph.size());

    graph.addNode("Osaid");
    graph.addNode("Tareq");
    graph.addNode("Mohammad");

    assertEquals(3, graph.size());

  }

  @DisplayName("adding the same node as an edge")
  @Test
  void graphAddEdgeSameNode() {
    Graph<String,Integer> graph = new Graph<>();
    graph.addNode("osaid");
    graph.addNode("rahaf");
    // adding edge testing
    graph.addEdge("osaid", "osaid");
    assertEquals("[osaid]", graph.getNeighbors("osaid").toString());

  }

  @DisplayName("empty graph should returns null")
  @Test
  void graphEmptyGraph() {
    Graph<String,Integer> graph = new Graph<>();
    assertNull(graph.getNodes());

  }

  @DisplayName("returns a list of all the nodes using breadth first logic")
  @Test
  void graphBreadthFirst() {

    Graph<String,Integer> graph = new Graph<>();
    // adding the nodes
    graph.addNode("osaid");
    graph.addNode("rahaf");
    graph.addNode("mohammad");
    graph.addNode("tareq");
    graph.addNode("ammar");

    // ADDING THE EDGES

    //happy path
    graph.addEdge("osaid", "rahaf");
    assertEquals("[osaid, rahaf]", graph.breadthFirst("osaid").toString());

    // adding more stuff
    graph.addEdge("osaid", "tareq");
    graph.addEdge("tareq", "ammar");
    assertEquals("[osaid, rahaf, tareq, ammar]", graph.breadthFirst("osaid").toString());

    // adding duplicated edge should return the same as above
    graph.addEdge("ammar","rahaf");
    assertEquals("[osaid, rahaf, tareq, ammar]", graph.breadthFirst("osaid").toString());

    // edge cases
    assertThrows(IllegalArgumentException.class, () -> graph.breadthFirst("nobody"));
  }

  @DisplayName("returns the total cost of the trip")
  @Test
  void graphBusinessTripTest() {

    Graph<String, Integer> graph = new Graph<>();
    graph.addNode("Metroville");
    graph.addNode("Pandora");
    graph.addNode("Arendelle");
    graph.addNode("New Monstropolis");
    graph.addNode("Naboo");
    graph.addNode("Narnia");

    graph.addEdge("Metroville", "Pandora", 82);
    graph.addEdge("Metroville", "Arendelle", 99);
    graph.addEdge("Metroville", "New Monstropolis", 105);
    graph.addEdge("Metroville", "Naboo", 26);
    graph.addEdge("Metroville", "Narnia", 37);
    graph.addEdge("Narnia", "Naboo", 250);
    graph.addEdge("Pandora", "Arendelle", 150);
    graph.addEdge("Arendelle", "New Monstropolis", 42);
    graph.addEdge("Naboo", "New Monstropolis", 73);

    List<String> trip = new ArrayList<>();
    trip.add("Metroville");
    trip.add("Pandora");

    //Happy way
    assertEquals("True , $82",Graph.businessTrip(graph,trip));


    // Edge Case
    List<String> trip2 = new ArrayList<>();
    trip2.add("asdasdasd");
    trip2.add("Pandora");
    assertEquals("Node is not present in the graph",Graph.businessTrip(graph,trip2));

    // Long Way
    List<String> trip3 = new ArrayList<>();
    trip3.add("Metroville");
    trip3.add("Narnia");
    trip3.add("Naboo");
    trip3.add("New Monstropolis");
    trip3.add("Arendelle");
    trip3.add("Pandora");

    assertEquals("True , $552",Graph.businessTrip(graph,trip3));
  }



}
