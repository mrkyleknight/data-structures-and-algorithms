package graphdepthfirst;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

  @Test
  public void testDepthFirst() {
    Graph graph = new Graph();
    graph.addNode("A");
    graph.addNode("B");
    graph.addNode("C");
    graph.addNode("D");

    graph.addEdge("A", "B");
    graph.addEdge("B", "C");
    graph.addEdge("C", "D");
    graph.addEdge("D", "A");

    Node startNode = graph.nodes.get("A");
    List<String> result = graph.depthFirst(startNode);
    assertEquals(List.of("A", "B", "C", "D"), result);
  }

  @Test
  public void testSingleNode() {
    Graph graph = new Graph();
    graph.addNode("A");

    Node startNode = graph.nodes.get("A");
    List<String> result = graph.depthFirst(startNode);
    assertEquals(List.of("A"), result);
  }

  @Test
  public void testDisconnectedNodes() {
    Graph graph = new Graph();
    graph.addNode("A");
    graph.addNode("B");

    Node startNode = graph.nodes.get("A");
    List<String> result = graph.depthFirst(startNode);
    assertEquals(List.of("A"), result);
  }
}
