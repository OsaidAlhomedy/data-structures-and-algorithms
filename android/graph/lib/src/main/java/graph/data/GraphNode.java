package graph.data;

public class GraphNode<T> {

  private final T data;

  public GraphNode(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  @Override
  public String toString() {
    return data.toString();
  }
}
