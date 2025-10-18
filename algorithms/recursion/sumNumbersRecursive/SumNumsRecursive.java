import java.util.List;

public class SumNumsRecursive {

  public static int sumNumbersRecursive(List<Integer> nums){
    if (nums.size() == 0) {
      return 0;
    }
    return nums.get(0) + sumNumbersRecursive(nums.subList(1, nums.size()));
  }
  public static void main(String[] args) {
    System.out.println(sumNumbersRecursive(List.of(5, 2, 9, 10))); // -> 26
    System.out.println(sumNumbersRecursive(List.of(1, -1, 1, -1, 1, -1, 1))); // -> 1
    System.out.println(sumNumbersRecursive(List.of())); // -> 0
    System.out.println(sumNumbersRecursive(List.of(1000, 0, 0, 0, 0, 0, 1))); // -> 1001
    System.out.println(sumNumbersRecursive(List.of(700, 70, 7))); // -> 777
    System.out.println(sumNumbersRecursive(List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1))); // -> -55
    System.out.println(sumNumbersRecursive(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))); // -> 0
    System.out.println(sumNumbersRecursive(List.of(123456789, 12345678, 1234567, 123456, 12345, 1234, 123, 12, 1, 0))); // -> 137174205
  }
}

/* Time & Space Complexity
 * 
 * Time: O(n^2), Space: O(n^2)
 */
