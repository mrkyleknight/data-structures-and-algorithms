package GraphBreadth;

import java.util.LinkedList;

public class Node<T> {
  public T value;
  public LinkedList<Node<T>> neighbors;

  public Node(T value) {
    this.value = value;
    neighbors = new LinkedList<>();
  }
}
