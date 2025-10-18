
public class SumList {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static int sumList(Node<Integer> head) {
    int sum = 0;

    Node<Integer> currentNode = head;

    while (currentNode != null) {
      sum = sum + currentNode.value;
      currentNode = currentNode.next;
    }

    System.out.println("This is the sum: " + sum);
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    // 2 -> 8 -> 3 -> -1 -> 7
    sumList(a); // 19

    Node<Integer> x = new Node<>(38);
    Node<Integer> y = new Node<>(4);
    x.next = y;
    // 38 -> 4
    sumList(x); // 42

    sumList(null); // 0
  }
}
