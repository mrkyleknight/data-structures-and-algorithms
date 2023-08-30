package codechallenges.GraphBusinessTrip;

import java.util.List;

public class BusinessTrip {
  public static Integer findCostForLeg(String currentCity, String nextCity, List<Edge> edges) {
    for (Edge edge : edges) {
      if (edge.getDestination().equals(nextCity)) {
        return edge.getCost();
      }
    }
    return null;
  }

  public static Integer calculateTripCost(Graph graph, String[] cities) {
    int totalCost = 0;
    for (int i = 0; i < cities.length - 1; i++) {
      String currentCity = cities[i];
      String nextCity = cities[i + 1];
      List<Edge> edges = graph.getEdges(currentCity);
      if (edges == null) {
        return null;
      }

      Integer costForLeg = findCostForLeg(currentCity, nextCity, edges);
      if (costForLeg == null) {
        return null;
      }

      totalCost += costForLeg;
    }
    return totalCost;
  }
}
