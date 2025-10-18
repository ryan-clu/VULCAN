import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairSum {

  public static List<Integer> pairSum(List<Integer> nums, int targetSum) {
    Map<Integer, Integer> elemIndices = new HashMap<>();

    for (int i = 0; i < nums.size(); i += 1) {
      int currElement = nums.get(i);
      int complement = targetSum - currElement;

      if (elemIndices.containsKey(complement)) {
        // List.of(elemIndices.get(complement), i);
        List<Integer> returnList = new ArrayList<>();

        returnList.add(elemIndices.get(complement));
        returnList.add(i);

        System.out.println("Returned indeces are... " + returnList);
        return returnList;
      }

      elemIndices.put(currElement, i);
    }

    // return null;
    return new ArrayList<>(); // instead of null
  }

  public static void main(String[] args) {
    pairSum(List.of(3, 2, 5, 4, 1), 8); // -> [0, 2]
    pairSum(List.of(4, 7, 9, 2, 5, 1), 5); // -> [0, 5]
    pairSum(List.of(4, 7, 9, 2, 5, 1), 3); // -> [3, 5]
    pairSum(List.of(9, 9), 18); // -> [0, 1]
    pairSum(List.of(6, 4, 2, 8), 12); // -> [1, 3]
  }

}

// O(n) T, O(n) S

/*
 * Approach
 * 
 * - Utilizing the concept of "complements".
 * eg. 3 is the complement of 5, if the target sum is 8
 * - Loop over each element of the list/array of numbers.
 * - The current element is subtracted from the target, and
 * that difference is captured in a variable called "complement".
 * - If that complement has been seen previously, return a set/pair
 * of indeces - the current element and the complement/previously
 * seen complement's indeces.
 * - Utilize a HashMap data structure to keep track of elements (as keys)
 * and their index in list/array (as values)
 * 
 */
