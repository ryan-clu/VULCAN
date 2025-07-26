import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

// HashSet solution
public class Intersection {

  public static List<Integer> intersection(List<Integer> a, List<Integer> b) {
    Set<Integer> seenElemsA = new HashSet<>();
    List<Integer> intersectList = new ArrayList<>();

    for (int currElemA : a) {
      seenElemsA.add(currElemA);
    }

    for (int currElemB : b) {
      if (seenElemsA.contains(currElemB)) {
        intersectList.add(currElemB);
      }
    }

    System.out.println("The intersection list is... " + intersectList);
    return intersectList;
  }

  public static void main(String[] args) {
    List<Integer> a = List.of(4, 2, 1);
    List<Integer> b = List.of(1, 2, 4, 6);
    intersection(a, b); // -> [1,2,4]

    List<Integer> c = List.of(0, 1, 2);
    List<Integer> d = List.of(10, 11);
    intersection(c, d); // -> []
  }
}

// O(n+m) T, O(n) S
