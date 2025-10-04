import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class IntersectionWithDuplicatesTest {
 // Main Driver
  public static List<String> intersectionWithDupes(List<String> listA, List<String> listB){
    Map<String, Integer> freqMapA = freqMapGenerator(listA); // O(n) T, O(n) S
    Map<String, Integer> freqMapB = freqMapGenerator(listB); // O(m) T, O(m) S

    List<String> intersectionReturn = new ArrayList<>(); // O(n) S

    for (Map.Entry<String, Integer> elemA : freqMapA.entrySet()){ // O(n) T
      String keyA = elemA.getKey();
      Integer freqKeyA = elemA.getValue();

      if (freqMapB.containsKey(keyA)){
        Integer freqKeyB = freqMapB.get(keyA);
        Integer commonFreq = Math.min(freqKeyA, freqKeyB);

        for (int i = 0; i < commonFreq; i += 1){
          intersectionReturn.add(keyA);
        }
      }
    }

    System.out.println("This is intersectionReturn: " + intersectionReturn);
    return intersectionReturn;
  }

  // Helper
  public static Map<String, Integer> freqMapGenerator(List<String> inputList){
    Map<String, Integer> freqMap = new HashMap<>();

    for (String elem : inputList){
      if (!(freqMap.containsKey(elem))) {
        freqMap.put(elem, 0);
      }
      freqMap.put(elem, freqMap.get(elem) + 1);
    }

    return freqMap;
  }

  public static void main(String[] args) {
    intersectionWithDupes(
        List.of("a", "b", "c", "b"),
        List.of("x", "y", "b", "b")); // -> ["b", "b"]

    intersectionWithDupes(
        List.of("q", "b", "m", "s", "s", "s"),
        List.of("s", "m", "s")); // -> ["m", "s", "s"]

    intersectionWithDupes(
        List.of("p", "r", "r", "r"),
        List.of("r")); // -> ["r"]

    intersectionWithDupes(
        List.of("t", "v", "u"),
        List.of("g", "e", "d", "f")); // -> [ ]

    intersectionWithDupes(
        List.of("a", "a", "a", "a", "a", "a"),
        List.of("a", "a", "a", "a")); // -> ["a", "a", "a", "a"]
  }
}

/* 
 * Approach
 * - Utilize a helper function that can loop over a given list
 * and generate a hashmap whose keys are the elements that 
 * appear in the input list and the values are the elements'
 * frequencies of appearance.
 * - Generate hashmaps/freqMaps for both lists.
 * - Loop over the keySet of one of the hashMaps and see
 * if the given key being processed also appears in the other
 * hashMap.
 * - If appears in both, compare the values (frequencies) and
 * take the lesser (the min) of the two.
 * - Push that key (element/letter) to a return list for the
 * min number of times it appears.
 * 
 * Complexity Analysis (for above approach):
 * O(2n+m) T, O(2n+m) S
 * O(n+m) T/S
 * 
 */

/*
 * Optimization
 * - generate hashmap for first list
 * - loop over array of second list, and from freqHash
 * of first list check if freq val is greater than 0.
 * - If greater than 0, subtract 1, and add char string
 * to return array.
 * 
 */
