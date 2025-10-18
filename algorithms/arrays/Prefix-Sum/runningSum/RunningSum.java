import java.util.List;
import java.util.ArrayList;

public class RunningSum {

  public static List<Integer> runningSum(List<Integer> nums) {
    if (nums.isEmpty()) {
      System.out.println("This is runningSum returned..." + nums);
      return nums;
    }

    List<Integer> numsRunSum = new ArrayList<>(nums);
    int currRunSum = 0;

    for (int i = 0; i < numsRunSum.size(); i += 1) {
      int currNum = numsRunSum.get(i);
      currRunSum = currRunSum + currNum;
      numsRunSum.set(i, currRunSum);
    }

    System.out.println("This is runningSum returned..." + numsRunSum);
    return numsRunSum;
  }
  public static void main (String[] args){
    runningSum(List.of(4, 2, 1, 6, 3, 6)); // -> [ 4, 6, 7, 13, 16, 22 ] 
    runningSum(List.of(10, 5, -2, 1, 1)); // -> [ 10, 15, 13, 14, 15 ] 
    runningSum(List.of(12, 88, 0, -50, 30, 2)); // -> [ 12, 100, 100, 50, 80, 82 ] 
    runningSum(List.of(2)); // -> [ 2 ] 
    runningSum(List.of()); // -> [ ] 
  }
}

// O(n) T, O(n) S

/* Approach
 * 
 * Key: Use a variable to capture the runningSum, mutate list in place.
 * 
 * Steps: 
 * - Instantiate an int variable and capture runningSum starting with 0.
 * - Utilize a traditional loop, that will keep track of indices.
 * - Mutate elements of list with current sum as we loop.
 */
