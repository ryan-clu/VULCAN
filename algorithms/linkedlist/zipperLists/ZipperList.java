
public class ZipperList {

  static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {

    Node<T> headLL = head1;
    Node<T> tailLL = head1;
    int counter = 0;
    Node<T> currNode1 = head1.next;
    Node<T> currNode2 = head2;

    while (currNode1 != null && currNode2 != null) {
      if (counter % 2 == 0) {
        tailLL.next = currNode2;
        tailLL = currNode2;
        currNode2 = currNode2.next;
      } else {
        tailLL.next = currNode1;
        tailLL = currNode1;
        currNode1 = currNode1.next;
      }
      counter++;
    }

    if (currNode1 != null) {
      tailLL.next = currNode1;
    }

    if (currNode2 != null) {
      tailLL.next = currNode2;
    }

    return headLL;
  }
  // a -> b -> c
  // x -> y -> z

  // a -> x -> b -> y -> c -> z

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    a.next = b;
    b.next = c;
    // a -> b -> c

    Node<String> x = new Node<>("x");
    Node<String> y = new Node<>("y");
    Node<String> z = new Node<>("z");
    x.next = y;
    y.next = z;
    // x -> y -> z

    zipperLists(a, x);
    // a -> x -> b -> y -> c -> z
  }
}

/*
 * Approach
 * 
 * - Utilize a while loop that will traverse linked lists
 * as long as both current nodes are not null
 * - Need to keep track of "current tail" of linked list
 * being build
 * - Adjust pointers accordingly in while loop
 * - Once out of while loop, attach whichever list still
 * has remaining nodes.
 * - Return head.
 * 
 */
