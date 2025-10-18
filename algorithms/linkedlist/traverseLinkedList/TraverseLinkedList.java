
public class TraverseLinkedList {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static <T> void printList(Node<T> head) {
    Node<T> current = head;

    while (current != null) {
      System.out.println("This is the current node... " + current.value);
      current = current.next;
    }
  }

  public static void main(String[] args) {

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    printList(a);

  }

}
