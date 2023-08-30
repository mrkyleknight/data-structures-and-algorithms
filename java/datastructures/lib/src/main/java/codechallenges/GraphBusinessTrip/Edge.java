package codechallenges.GraphBusinessTrip;

public class Edge {
  String destination;
  int cost;

  public Edge(String destination, int cost) {
    this.destination = destination;
    this.cost = cost;
  }

  public String getDestination() {
    return destination;
  }

  public int getCost() {
    return cost;
  }
}
