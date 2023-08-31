package graphdepthfirst;

import java.util.*;

public class Graph {
  Map<String, Node> nodes;

  public Graph() {
    this.nodes = new HashMap<>();
  }

  public void addNode(String id) {
    nodes.put(id, new Node(id));
  }

  public void addEdge(String fromId, String toId) {
    Node fromNode = nodes.get(fromId);
    Node toNode = nodes.get(toId);
    if (fromNode != null && toNode != null) {
      fromNode.addAdjacentNode(toNode);
    }
  }

  public List<String> depthFirst(Node startNode) {
    List<String> result = new ArrayList<>();
    Stack<Node> stack = new Stack<>();
    Set<String> visited = new HashSet<>();

    stack.push(startNode);
    visited.add(startNode.getId());

    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();
      result.add(currentNode.getId());

      for (Node neighbor : currentNode.getAdjacentNodes()) {
        if (!visited.contains(neighbor.getId())) {
          stack.push(neighbor);
          visited.add(neighbor.getId());
        }
      }
    }
    return result;
  }
}
