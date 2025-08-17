import java.util.Arrays;

public class canPlaceFlowers {
  
  public static boolean canPlaceFlowersMethod(int[] flowerbed, int n){
    int numSpots = 0;

    for (int i = 0; i < flowerbed.length; i++){
      // Check if the current plot is empty.
      if (flowerbed[i] == 0) {
        // Check if the left and right plots are empty.
        boolean leftPosOpen = i == 0 || flowerbed[i-1] == 0;
        boolean rightPosOpen = i == flowerbed.length - 1 || flowerbed[i+1] == 0;

        if (leftPosOpen && rightPosOpen) {
          numSpots += 1;
          flowerbed[i] = 1;
          // Optimization: Early return true if spots exceeds/= n
          if (numSpots >= n) {
            return true;
          }
        }
      }
    }

    System.out.println("Flowers planted" + (Arrays.toString(flowerbed)));
    System.out.println("Flowers can be planted? " + (numSpots >= n));
    return numSpots >= n;
  }

  public static void main(String[] args){
    int[] flowerbed = {1,0,0,0,1,0,0};
    int n = 2;
    canPlaceFlowersMethod(flowerbed, n);
  }
}
