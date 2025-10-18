
public class ReverseList {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static <T> T reverseList(Node<T> head) {

    Node<T> prevNode = null;
    Node<T> currNode = head;

    while (currNode != null) {
      Node<T> nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }

    return prevNode.value;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    Node<String> e = new Node<>("e");
    Node<String> f = new Node<>("f");
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    // a -> b -> c -> d -> e -> f
    System.out.println(reverseList(a));
    // f -> e -> d -> c -> b -> a

    Node<String> x = new Node<>("x");
    Node<String> y = new Node<>("y");
    x.next = y;
    // x -> y
    System.out.println(reverseList(x));
    // y -> x

    Node<String> p = new Node<>("p");
    // p
    System.out.println(reverseList(p));
    // p
  }
}

/*
 * Approach
 * 
 * - Utilize a while loop to traverse linked list.
 * - Need to reverse pointers of each node to
 * point to prev node. Head node needs to point
 * to null.
 * - Utilize variables to capture prev, current node
 * 
 * Time: O(n)
 * Space: O(1)
 * 
 */
