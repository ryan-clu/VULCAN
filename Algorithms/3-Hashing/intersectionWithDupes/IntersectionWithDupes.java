import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class IntersectionWithDupes {

  // Driver Function
  public static List<String> intersectionWithDupes(List<String> a, List<String> b) {

    List<String> returnList = new ArrayList<>();
    Map<String, Integer> elemFreqA = elemFreqHM(a);
    Map<String, Integer> elemFreqB = elemFreqHM(b);

    for (Map.Entry<String, Integer> aElemFreq : elemFreqA.entrySet()) {
      String aElem = aElemFreq.getKey();
      Integer elemFreqInA = aElemFreq.getValue();

      if (elemFreqB.containsKey(aElem)) {
        Integer elemFreqInB = elemFreqB.get(aElem);
        Integer commonFreq = Math.min(elemFreqInA, elemFreqInB);

        for (int i = 0; i < commonFreq; i += 1) {
          returnList.add(aElem);
        }
      }
    }

    System.out.println("This is the returnList... " + returnList);
    return returnList;
  }

  // Helper Function
  public static Map<String, Integer> elemFreqHM(List<String> inputList) {
    Map<String, Integer> count = new HashMap<>();

    for (String element : inputList) {
      if (count.containsKey(element)) {
        count.put(element, count.get(element) + 1);
      } else {
        count.put(element, 1);
      }
    }

    System.out.println("This is count... " + count);
    return count;
  }

  // Run Program
  public static void main(String[] args) {
    // intersectionWithDupes(
    // List.of("a", "b", "c", "b"),
    // List.of("x", "y", "b", "b")); // -> ["b", "b"]

    intersectionWithDupes(
        List.of("q", "b", "m", "s", "s", "s"),
        List.of("s", "m", "s")); // -> ["m", "s", "s"]
  }
}

/*
 * Approach
 * 
 * Key:
 * - Use HashMap to track elements seen (as keys) in a given List
 * and the frequencies of the elements (as values) if there are
 * duplicates.
 * 
 * Steps:
 * - Loop over each Lists' elements and generate HashMaps of elements
 * they contain and those elements' frequencies.
 * - Loop over one of the HashMap's keySet (keys) and for a given key
 * see if the other list's HashMap also has that same key.
 * - If a matched key is found - compare the frequencies (values) stored
 * for the matching key in each respective HashMap. Take the lesser of the
 * two frequencies and that is the number of times that matched key/element
 * is to be added to a returnList.
 */
