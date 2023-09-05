package Graph;

import java.util.*;

public class Graph {
  private Map<Vertex, List<Edge>> adjacencyList = new HashMap<>();

  public Vertex addVertex(String value) {
    Vertex v = new Vertex(value);
    adjacencyList.putIfAbsent(v, new ArrayList<>());
    return v;
  }

  public void addEdge(Vertex v1, Vertex v2, int weight) {
    if (!adjacencyList.containsKey(v1) || !adjacencyList.containsKey(v2))
      throw new IllegalArgumentException("Both vertices should exist in the graph");
    adjacencyList.get(v1).add(new Edge(v2, weight));
    adjacencyList.get(v2).add(new Edge(v1, weight));
  }

  public Set<Vertex> getVertices() {
    return adjacencyList.keySet();
  }

  public List<Edge> getNeighbors(Vertex v) {
    return adjacencyList.getOrDefault(v, Collections.emptyList());
  }

  public int size() {
    return adjacencyList.size();
  }
}

