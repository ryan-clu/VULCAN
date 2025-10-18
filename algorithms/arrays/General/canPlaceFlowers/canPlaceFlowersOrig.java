import java.util.Arrays;

public class canPlaceFlowersOrig {

  public static boolean canPlaceFlowersMethod(int[] flowerbed, int n){
    // Edge case for flowerbed with one spot only.
    if (flowerbed.length == 1) {
      if (flowerbed[0] == 0) {
        return (1 >= n);
      } else {
        return (0 >= n);
      }
    }
    
    int numAvailableSpots = 0;

    for (int i = 0; i < flowerbed.length; i++){
      int j = i - 1;
      int k = i + 1;

      if (i == 0) {
        // Process first element
        if (flowerbed[i] == 0 && flowerbed[k] == 0){
          numAvailableSpots += 1;
          flowerbed[i] = 1;
        }
      } else if (i == (flowerbed.length-1)) {
        // Process last element
        if (flowerbed[i] == 0 && flowerbed[j] == 0){
          numAvailableSpots += 1;
          flowerbed[i] = 1;
        }
      } else if (flowerbed[i] == 0){
        if (j > 0 && k < flowerbed.length) {
          // Safe to look left & right
          if (flowerbed[j] == 0 && flowerbed[k] == 0){
            numAvailableSpots += 1;
            flowerbed[i] = 1;
          }
        }
      }
    }

    System.out.println("Flowers planted" + (Arrays.toString(flowerbed)));
    System.out.println("Flowers can be planted? " + (numAvailableSpots >= n));
    return numAvailableSpots >= n;
  }

  public static void main(String[] args){

    // int[] flowerbed = {1,0,0,0,1};
    // int n = 1;

    int[] flowerbed = {1,0,0,0,1,0,0};
    int n = 2;
    canPlaceFlowersMethod(flowerbed, n);

  }

}

/* Approach
 * 
 * - Loop over int arr that is flower bed.
 * - At each element, look if it is a free spot (0) or not.
 * - If it is a free spot, look at prev and next elements 
 * to see if there are plants adjacent. If no plants adjacent,
 * plant can be planted and +1 to number of spots availble.
 * - Change from free spot (0) to (1) to note that it has 
 * already been counted as a free spot.
 */
