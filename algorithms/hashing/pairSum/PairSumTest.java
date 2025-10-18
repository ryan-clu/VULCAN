import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PairSumTest {

  public static List<Integer> pairSum(List<Integer> numbers, int target){
    Map<Integer, Integer> numsAndIndex = new HashMap<>();

    for (int i = 0; i < numbers.size(); i += 1){
      int currNum = numbers.get(i); 
      int complement = target - currNum;

      if(numsAndIndex.containsKey(complement)){
        List<Integer> indicesReturn = new ArrayList<>(List.of(numsAndIndex.get(complement), i));
        System.out.println("Indices Return " + indicesReturn);
        return indicesReturn;
      }

      numsAndIndex.put(currNum, i);
    }

    System.out.println("No pair found.");
    return List.of(0,0);
  }

  public static void main(String[] args) {
    pairSum(List.of(3, 2, 5, 4, 1), 8); // -> [0, 2]
    pairSum(List.of(4, 7, 9, 2, 5, 1), 5); // -> [0, 5]
    pairSum(List.of(4, 7, 9, 2, 5, 1), 3); // -> [3, 5]
    pairSum(List.of(9, 9), 18); // -> [0, 1]
    pairSum(List.of(6, 4, 2, 8), 12); // -> [1, 3]
  }
}
