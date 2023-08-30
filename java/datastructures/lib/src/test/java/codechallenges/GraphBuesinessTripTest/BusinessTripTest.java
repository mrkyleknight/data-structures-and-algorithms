package codechallenges.GraphBuesinessTripTest;

import codechallenges.GraphBusinessTrip.BusinessTrip;
import codechallenges.GraphBusinessTrip.Edge;
import codechallenges.GraphBusinessTrip.Graph;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class BusinessTripTest {
  @Test
  public void testFindCostForLeg() {
    Graph graph = new Graph();
    graph.addEdge("A", "B", 100);
    List<Edge> edges = graph.getEdges("A");
    Integer cost = BusinessTrip.findCostForLeg("A", "B", edges);
    assertEquals((Integer) 100, cost);

    cost = BusinessTrip.findCostForLeg("A", "C", edges);
    assertNull(cost);

    cost = BusinessTrip.findCostForLeg("A", "A", edges);
    assertNull(cost);
  }

  @Test
  public void testCalculateTripCost() {
    Graph graph = new Graph();
    graph.addEdge("A", "B", 100);
    graph.addEdge("B", "C", 150);

    Integer cost = BusinessTrip.calculateTripCost(graph, new String[]{"A", "B"});
    assertEquals((Integer) 100, cost);

    cost = BusinessTrip.calculateTripCost(graph, new String[]{"A", "B", "C"});
    assertEquals((Integer) 250, cost);

    cost = BusinessTrip.calculateTripCost(graph, new String[]{"A", "C"});
    assertNull(cost);
  }
}
