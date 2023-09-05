package Graph;

import java.util.Objects;

public class Vertex {
  private String value;

  public Vertex(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Vertex vertex = (Vertex) obj;
    return Objects.equals(value, vertex.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
