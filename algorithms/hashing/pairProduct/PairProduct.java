import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PairProduct {

  public static List<Integer> pairProduct(List<Integer> nums, int target) {
    HashMap<Integer, Integer> elemIndices = new HashMap<>();

    for (int i = 0; i < nums.size(); i += 1) {
      int currElement = nums.get(i);
      int complement = target / currElement;

      if (elemIndices.containsKey(complement)) {
        List<Integer> returnList = List.of(elemIndices.get(complement), i);
        System.out.println("Returned indices are... " + returnList);
        return returnList;
      }

      elemIndices.put(currElement, i);
    }

    return new ArrayList<>(); // return empty list
  }

  public static void main(String[] args) {
    pairProduct(List.of(3, 2, 5, 4, 1), 8); // -> [1, 3]
    pairProduct(List.of(3, 2, 5, 4, 1), 10); // -> [1, 2]
    pairProduct(List.of(4, 7, 9, 2, 5, 1), 5); // -> [4, 5]
    pairProduct(List.of(4, 7, 9, 2, 5, 1), 35); // -> [1, 4]
    pairProduct(List.of(4, 6, 8, 2), 16); // -> [2, 3]
  }
}

// O(n) T, O(n) S

/*
 * Approach
 * 
 * Keys:
 * - Utilize the concept of "complements". The number that I need to
 * multiple a given number by to get my target product.
 * - Utilize a HashMap data structure, to record numbers that I have
 * seen and their index. HashMap DSs have quick O(1) lookups.
 * 
 * Steps:
 * - Loop over elements of list sequentially. Traditional for loop...
 * as to get the current index.
 * - Divide target product by current element to get complement.
 * - If complement was previously seen, then return list of
 * complement's index and current index.
 */