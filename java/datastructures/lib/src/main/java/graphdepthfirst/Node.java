package graphdepthfirst;

import java.util.ArrayList;
import java.util.List;

public class Node {
  String id;
  List<Node> adjacentNodes;

  public Node(String id) {
    this.id = id;
    this.adjacentNodes = new ArrayList<>();
  }

  public void addAdjacentNode(Node node) {
    adjacentNodes.add(node);
  }

  public List<Node> getAdjacentNodes() {
    return adjacentNodes;
  }

  public String getId() {
    return id;
  }
}
