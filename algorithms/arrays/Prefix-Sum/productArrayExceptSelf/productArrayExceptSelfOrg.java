import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class productArrayExceptSelfOrg {
  
  public static int[] productArrayExceptSelf(int[] nums){
    List<Integer> products = new ArrayList<>();
    Map<Integer, Integer> indexAndNum = new HashMap<>();

    // Populate HashMap with index key and number value.
    for (int i = 0; i < nums.length; i++) {
      indexAndNum.put(i, nums[i]);
    }
    // Loop over nums array again, generate products without the given num.
    for (int i = 0; i < nums.length; i++) {
      int product = 1;

      for (int j = 0; j < nums.length; j++) {
        if (i == j){
          continue;
        } else {
          product *= indexAndNum.get(j);
        }
      }

      products.add(product);
    }

    int[] productsNArr = new int[products.size()];
    for (int k = 0; k < products.size(); k++){
      productsNArr[k] = products.get(k);
    }

    System.out.println("This is the return ArrayList..." + Arrays.toString(productsNArr));
    return productsNArr;
  }

  public static void main(String[] args){
    int[] nums = {1,2,3,4}; //[24,12,8,6]
    productArrayExceptSelf(nums);
  }
}

/* Approach
 * 
 * - Utilize a traditional for loop and loop over elements of num.
 * - Generate a HashMap of the nums - key is index, value is the num.
 * - Loop over nums again, and utilize O(1) hashmap lookup to calculate
 * product of nums except for given element.
 * - Products are captured in a new ArrayList to be returned.
 */
