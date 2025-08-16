import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ExclusiveItems {

  public static List<Integer> exclusiveItems (List<Integer> a, List<Integer> b) {
    List<Integer> returnList = new ArrayList<>(); // O(n+m) S
    Set<Integer> elemsA = new HashSet<>();

    for (int currElemA : a) { // O(n) T         
      elemsA.add(currElemA);  // O(n) S
    }

    for (int currElemB : b) { // O(m) T
      if (elemsA.contains(currElemB)) {
        elemsA.remove(currElemB);
      } else {
        returnList.add(currElemB);
      }
    }

    for (int remainingElemA : elemsA) { // O(n) T
      returnList.add(remainingElemA);
    }

    System.out.println("This is returnList... " + returnList);
    return returnList;
  }

  public static void main(String[] args) {
    // List<Integer> a = List.of(4, 2, 1, 6);
    // List<Integer> b = List.of(3, 6, 9, 2, 10);
    // exclusiveItems(a, b); // -> [4,1,3,9,10]

    List<Integer> a = List.of(0, 1, 2);
    List<Integer> b = List.of(10, 11);
    exclusiveItems(a, b); // -> [0,1,2,10,11]
  }
}

/* Complexity Analysis
 * 
 * n = length of array a, m = length of array b
 * Time: O(n+m)
 * Space: O(n+m)
 */

/* Approach
 * 
 * Keys:
 * - use a HashSet to track what I've seen in the first list,
 * using a HashSet will give me a quick lookup.
 * 
 * Steps:
 * - First loop over List a and capture elements seen in
 * list in a hash set.
 * - Loop through second List b and evaluate/process. If
 * the given current elem B is not in hash set of a, then
 * add to a return list. Do not add an elem of b if it exists
 * in hash set of a, and remove that elem from the hash set.
 * - Loop through hash set and add elements that remain to 
 * the return list.
 */
