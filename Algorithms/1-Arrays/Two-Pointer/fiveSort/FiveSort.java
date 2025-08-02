import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FiveSort {

  public static List<Integer> fiveSort(List<Integer> nums) {
    int i = 0;
    int j = nums.size() - 1;

    while(i <= j) {
      int numAtI = nums.get(i);
      int numAtJ = nums.get(j);

      if (numAtJ == 5) {              // Look for a non-5
        j -= 1;
      } else if (numAtI != 5) {       // Looking for a 5
        i += 1;
      } else {                        // Non-5 at tail, 5 at head
        // Collections.swap(nums, i, j);
        nums.set(i, numAtJ);
        nums.set(j, 5);
        j -= 1;
        i += 1;
      }
    }

    System.out.println("This is nums returned..." + nums);
    return nums;
  }
  public static void main(String[] args) {
    List<Integer> array = new ArrayList<>(List.of(5, 0));
    fiveSort(array); // -> [0, 5] 
    
    List<Integer> array1 = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
    fiveSort(array1); // -> [12, 7, 1, 12, 5, 5] 
    
    List<Integer> array2 = new ArrayList<>(List.of(5, 2, 5, 6, 5, 1, 10, 2, 5, 5));
    fiveSort(array2); // -> [2, 2, 10, 6, 1, 5, 5, 5, 5, 5] 
    
    List<Integer> array3 = new ArrayList<>(List.of(5, 5, 5, 1, 1, 1, 4));
    fiveSort(array3); // -> [4, 1, 1, 1, 5, 5, 5] 
    
    List<Integer> array4 = new ArrayList<>(List.of(5, 1, 2, 5, 5, 3, 2, 5, 1, 5, 5, 5, 4, 5));
    fiveSort(array4); // -> [4, 1, 2, 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5] 
  }
}

// O(n) T, O(1) S

/* Approach
 * 
 * Key: Two pointer strategy. One pointer that starts at head of list,
 * one pointer that starts from tail of list.
 * 
 * Steps:
 * - Utilize a while loop, that breaks once pointer indices cross eachouther.
 * As in, the head and tail pointers should never cross.
 * - Start off with tail pointer, process list elements until it finds an
 * element that is not a 5. Which means eligibilit for swapping.
 * - Then move head pointer, process list elements until a 5 is hit. This
 * needs to be swapped out.
 */
