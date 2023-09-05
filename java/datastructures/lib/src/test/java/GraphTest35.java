import Graph.Edge;
import Graph.Vertex;
import Graph.Graph;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest35 {
  private Graph graph;

  @Before
  public void setUp() {
    graph = new Graph();
  }

  @Test
  public void testAddVertex() {
    Vertex v = graph.addVertex("A");
    assertNotNull(v);
    assertEquals("A", v.getValue());
    assertTrue(graph.getVertices().contains(v));
  }

  @Test
  public void testAddEdge() {
    Vertex v1 = graph.addVertex("A");
    Vertex v2 = graph.addVertex("B");
    graph.addEdge(v1, v2, 5);

    List<Edge> neighborsA = graph.getNeighbors(v1);
    List<Edge> neighborsB = graph.getNeighbors(v2);

    assertTrue(neighborsA.stream().anyMatch(e -> e.getVertex().equals(v2) && e.getWeight() == 5));
    assertTrue(neighborsB.stream().anyMatch(e -> e.getVertex().equals(v1) && e.getWeight() == 5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddEdgeWithNonExistentVertex() {
    Vertex v1 = new Vertex("A");
    Vertex v2 = new Vertex("B");
    graph.addEdge(v1, v2, 5);
  }

  @Test
  public void testGetVertices() {
    assertTrue(graph.getVertices().isEmpty());
    graph.addVertex("A");
    graph.addVertex("B");
    assertEquals(2, graph.getVertices().size());
  }

  @Test
  public void testGetNeighbors() {
    Vertex v1 = graph.addVertex("A");
    Vertex v2 = graph.addVertex("B");
    graph.addEdge(v1, v2, 5);
    List<Edge> neighbors = graph.getNeighbors(v1);
    assertEquals(1, neighbors.size());
    assertEquals(v2, neighbors.get(0).getVertex());
    assertEquals(5, neighbors.get(0).getWeight());
  }

  @Test
  public void testSize() {
    assertEquals(0, graph.size());
    graph.addVertex("A");
    assertEquals(1, graph.size());
  }
}
