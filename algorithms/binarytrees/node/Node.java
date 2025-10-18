package algorithms.binarytrees.node;

public class Node<T> {
  public T value;
  public Node<T> left;
  public Node<T> right;

  public Node(T val) {
    this.value = val;
    this.left = null;
    this.right = null;
  }
}