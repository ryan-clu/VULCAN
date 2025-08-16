import java.util.List;
import java.util.ArrayList;

class kidsWithGreatestNumCandies {

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
    List<Boolean> returnArr = new ArrayList<>();
    int currMostCandyNum = 0;

    for (int numCandy : candies) {
      if (numCandy > currMostCandyNum) {
        currMostCandyNum = numCandy;
      }
      // currMostCandyNum = Math.max(numCandy, currMostCandyNum);
    }

    for (int kidWithNumCandy : candies) {
      if ((kidWithNumCandy + extraCandies) >= currMostCandyNum) {
        returnArr.add(true);
      } else {
        returnArr.add(false);
      }
      // returnArr.add(kidWithNumCandy + extraCandies >= currMostCandyNum);
    };

    System.out.println("This is the return ArrayList..." + returnArr);
    return returnArr;
  }

  public static void main(String[] args){
    int[] candies = {2,3,5,1,3};
    int extraCandies = 3;
    kidsWithCandies(candies, extraCandies); // [true,true,true,false,true] 
  }

};

/* Complexity Analysis
 * Time: O(2n)... O(n)
 * Space: O(n)
 */

/** Approach
 * 
 * - Utilize a traditional/enhanced loop - identify the current most candy amount.
 * Capture in a variable currMostCandyNum.
 * - Loop over int array again, and add extra num candies. If total is greater than
 * currMostCandyNum, then "true" if not "false".
 * - a returnArr is initialized, with size equal to given int array, and boolean values
 * pushed into this array.
 */