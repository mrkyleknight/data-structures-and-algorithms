package GraphBreadthTest;

import static org.junit.jupiter.api.Assertions.*;

import GraphBreadth.Graph;
import GraphBreadth.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class GraphTest {

  @Test
  public void testBreadthFirst() {
    Graph<Integer> graph = new Graph<>();
    Node<Integer> node1 = graph.addNode(1);
    Node<Integer> node2 = graph.addNode(2);
    Node<Integer> node3 = graph.addNode(3);

    graph.addEdge(node1, node2);
    graph.addEdge(node1, node3);

    assertEquals(Arrays.asList(1, 2, 3), graph.breadthFirst(node1));
  }

  @Test
  public void testBreadthFirstSingleNode() {
    Graph<Integer> graph = new Graph<>();
    Node<Integer> node1 = graph.addNode(1);

    assertEquals(Arrays.asList(1), graph.breadthFirst(node1));
  }

  @Test
  public void testBreadthFirstEmptyGraph() {
    Graph<Integer> graph = new Graph<>();

    assertEquals(Collections.emptyList(), graph.breadthFirst(null));
  }
}
