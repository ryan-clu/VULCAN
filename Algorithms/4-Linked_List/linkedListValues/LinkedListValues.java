import java.util.List;
import java.util.ArrayList;

public class LinkedListValues {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static List<String> linkedListValues(Node<String> head) {
    List<String> llValues = new ArrayList<>();
    Node<String> currentNode = head;

    while (currentNode != null) {
      llValues.add(currentNode.value);
      currentNode = currentNode.next;
    }

    System.out.println("This is llValues: " + llValues);
    return llValues;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    // a -> b ->
    linkedListValues(a); // -> [ "a", "b", "c", "d" ]
  }
}

/*
 * 
 * static class Node {
 * char value;
 * Node next;
 * 
 * Node(char value) {
 * this.value = value;
 * this.next = null;
 * }
 * }
 * 
 */