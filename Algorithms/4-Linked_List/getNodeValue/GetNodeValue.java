public class GetNodeValue {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static <T> T getNodeValue(Node<T> head, int targetIndex) {
    int currIndex = 0;
    Node<T> currNode = head;

    while (currNode != null) {
      if (currIndex == targetIndex) {
        return currNode.value;
      }
      currIndex = currIndex + 1;
      currNode = currNode.next;
    }

    return null;
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
    System.out.println(getNodeValue(a, 2)); // "c"
    System.out.println(getNodeValue(a, 3)); // "d"
    System.out.println(getNodeValue(a, 7)); // null

    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    node1.next = node2;

    // banana -> mango
    System.out.println(getNodeValue(node1, 0)); // "banana"
    System.out.println(getNodeValue(node1, 1)); // "mango"
    System.out.println(getNodeValue(node1, 3)); // null

  }
}

/*
 * Approach
 * 
 * - Utilize a while loop to traverse the linked list.
 * - Utilize an index variable to track the current
 * "index" of a node that I am on.
 * - If I am still traversing the LL and hit the target
 * index, return a value.
 * - If I break out of LL and haven't hit index - return
 * a null.
 * 
 * Complexity
 * O(n) T
 * O(1) S
 */
