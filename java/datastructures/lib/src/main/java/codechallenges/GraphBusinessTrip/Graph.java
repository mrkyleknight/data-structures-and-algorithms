package codechallenges.GraphBusinessTrip;

import java.util.*;

public class Graph {
  Map<String, List<Edge>> adjList;

  public Graph() {
    this.adjList = new HashMap<>();
  }

  public void addEdge(String src, String dest, int cost) {
    this.adjList.putIfAbsent(src, new ArrayList<>());
    this.adjList.get(src).add(new Edge(dest, cost));
  }

  public List<Edge> getEdges(String city) {
    return adjList.getOrDefault(city, null);
  }
}
