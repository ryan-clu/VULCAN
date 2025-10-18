import java.util.List;
import java.util.ArrayList;

public class RunningSumOptimized {

  public static List<Integer> runningSum(List<Integer> nums) {

    List<Integer> numsRunSum = new ArrayList<>(nums);
    int currRunSum = 0;

    for (int num : nums) {
      currRunSum += num;
      numsRunSum.add(currRunSum);
    }

    System.out.println("This is runningSum returned..." + numsRunSum);
    return numsRunSum;
  }
  public static void main(String[] args) {
    runningSum(List.of(4, 2, 1, 6, 3, 6)); // -> [ 4, 6, 7, 13, 16, 22 ] 
    runningSum(List.of(10, 5, -2, 1, 1)); // -> [ 10, 15, 13, 14, 15 ] 
    runningSum(List.of(12, 88, 0, -50, 30, 2)); // -> [ 12, 100, 100, 50, 80, 82 ] 
    runningSum(List.of(2)); // -> [ 2 ] 
    runningSum(List.of()); // -> [ ] 
  }
  
}

// O(n) T, O(n) S
