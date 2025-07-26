import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// HashMap solution
public class Intersection2 {

  public static List<Integer> intersection(List<Integer> a, List<Integer> b) {
    Map<Integer, Integer> elemA = new HashMap<>();
    List<Integer> intersectList = new ArrayList<>();

    for (int i = 0; i < a.size(); i += 1) {
      int currElemA = a.get(i);
      elemA.put(currElemA, i);
    }

    for (int currElemB : b) {
      if (elemA.containsKey(currElemB)) {
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

/*
 * Approach
 * 
 * Keys:
 * - Don't want to loop over one list's elements and loop over the
 * other lists elements for matches. This is the brute force approach
 * and is O(n^2).
 * - Want to utilize a HashMap DS for quick lookup/verification ability.
 * 
 * Steps:
 * - Loop over first List and capture elements as keys in HashMap DS.
 * - Loop over second List and if element is in HashMap DS, then
 * push that common element that exists in both lists to a new List
 * that I generate for return.
 */
