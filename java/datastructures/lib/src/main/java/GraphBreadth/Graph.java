package GraphBreadth;

import java.util.*;

public class Graph<T> {
  private Set<Node<T>> nodes;

  public Graph() {
    nodes = new HashSet<>();
  }

  public Node<T> addNode(T value) {
    Node<T> node = new Node<>(value);
    nodes.add(node);
    return node;
  }

  public void addEdge(Node<T> node1, Node<T> node2) {
    node1.neighbors.add(node2);
    node2.neighbors.add(node1);
  }

  public List<T> breadthFirst(Node<T> start) {
    Queue<Node<T>> queue = new LinkedList<>();
    Set<Node<T>> visited = new HashSet<>();
    List<T> output = new ArrayList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      Node<T> current = queue.poll();
      output.add(current.value);

      for (Node<T> neighbor : current.neighbors) {
        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
      }
    }

    return output;
  }
}
