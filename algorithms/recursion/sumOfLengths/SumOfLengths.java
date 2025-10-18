import java.util.List;

public class SumOfLengths {
  
  public static long sumOfLengths(List<String> words){
    if (words.size() == 0){
      return 0;
    }
    return words.get(0).length() + sumOfLengths(words.subList(1, words.size()));
  }
  public static void main(String[] args){
    System.out.println(sumOfLengths(List.of("goat", "cat", "purple")));
    System.out.println(sumOfLengths(List.of("bike", "at", "pencils", "phone")));
    System.out.println(sumOfLengths(List.of()));
    System.out.println(sumOfLengths(List.of("", " ", "  ", "   ", "    ", "     ")));
  }
}

/* Time & Space Complexity
 * 
 * Time: O(n^2), Space: O(n^2)
 */
