public class LinkedListFind {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static <T> boolean linkedListFind(Node<T> head, T target) {
    Node<T> currentNode = head;

    while (currentNode != null) {
      if (currentNode.value == target) {
        return true;
      }
      currentNode = currentNode.next;
    }

    return false;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    // a -> b -> c -> d
    System.out.println(linkedListFind(a, "c")); // true
    System.out.println(linkedListFind(a, "d")); // true
    System.out.println(linkedListFind(a, "q")); // false

    Node<String> node1 = new Node<>("jason");
    Node<String> node2 = new Node<>("leneli");
    node1.next = node2;
    // jason -> leneli
    System.out.println(linkedListFind(node1, "jason")); // true

    Node<Integer> node4 = new Node<>(42);
    // 42
    System.out.println(linkedListFind(node4, 100)); // false

  }
}
