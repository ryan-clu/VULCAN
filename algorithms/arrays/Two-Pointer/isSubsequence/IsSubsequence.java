
public class IsSubsequence {
  
  public static boolean isSubsequence(String word1, String word2) {
    
    if (word1.length() > word2.length()) {
      System.out.println("False");
      return false;
    }

    int i = 0; // Pointer for word1
    int j = 0; // Pointer for word2

    while (i < word1.length() && j < word2.length()) {
      if (word2.charAt(j) == word1.charAt(i)) {
        i += 1;
        j += 1;
      } else {
        j += 1;
      }
    }

    if (i == word1.length()) {
      System.out.println("True");
      return true;
    }

    System.out.println("False");
    return false;
  }

  public static void main(String[] args) {
    isSubsequence("bde", "abcdef"); // -> true
    isSubsequence("bda", "abcdef"); // -> false
    isSubsequence("ser", "super"); // -> true
    isSubsequence("serr", "super"); // -> false
    isSubsequence("ama", "camera"); // -> true
    isSubsequence("unfun", "unfortunate"); // -> true
    isSubsequence("riverbed", "river"); // -> false
    isSubsequence("river", "riverbed"); // -> true
  }
}


/* Approach
 * 
 * Key: Use two pointers to eliminate characters
 * until find match or dont find match.
 * 
 * Steps:
 * - Compare lengths of strings - can early return false,
 * if string1 length is greater than string2 length.
 * - Utilize two pointers and a while loop, loop logic runs
 * as long as pointers dont cross.
 * - First pointer will start processing from front, looking
 * for a character that matches the first character of string1
 * and will eliminate any chars from the front of string2 that 
 * doesnt match.
 * - Second pointer will process from end, leaving chars that 
 * match and eliminating chars that don't match.
 * - When loop breaks, compare strings. If they match, return 
 * true - else false.
 */