package linkedlist;

public class LinkedList {
  Node head;

  public LinkedList() {
    this.head = null;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
  }

  public boolean includes(int value) {
    Node current = this.head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder listStr = new StringBuilder();
    Node current = this.head;
    while (current != null) {
      listStr.append("{ ").append(current.value).append(" } -> ");
      current = current.next;
    }
    listStr.append("NULL");
    return listStr.toString();
  }
}
