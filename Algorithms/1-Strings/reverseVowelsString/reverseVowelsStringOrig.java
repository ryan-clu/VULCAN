import java.util.Set;
import java.util.HashSet;

public class reverseVowelsStringOrig {

  public static String reverseVowelsString(String s) {

    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');

    char[] sArr = s.toCharArray();

    int i = 0;
    int j = sArr.length - 1;

    while (i < j){
      if (!(vowels.contains(sArr[j]))){
        j--;
      } else if (!(vowels.contains(sArr[i]))){
        i++;
      } else if ((vowels.contains(sArr[j])) && (vowels.contains(sArr[i]))){
        char forwardChar = sArr[i];
        char hindChar = sArr[j];

        sArr[j] = forwardChar;
        sArr[i] = hindChar;

        i++;
        j--;
      }
    }

    // Convert char[] back to string
    String result = new String(sArr);
    // String result = String.valueOf(sArr);

    System.out.println("This is the return string..." + result);
    return result;
  }

  public static void main(String[] args) {
    reverseVowelsString("IceCreAm"); //"AceCreIm"
    reverseVowelsString("leetcode"); //"leotcede"
  }

}

/* Complexity Analysis
 * 
 * Time: O(n) - loop over each char of string arr once
 * Space: O(2n) - create charArr and new modified return string. 
 * Vowels set is a constant. 
 */

/*
 * Approach
 * 
 * - Utilize a two pointer approach. One pointer starting at head
 * one starting from the tail.
 * - Pointers will look for chars that are vowels. If pointers land
 * on two vowels, swap vowels.
 * - Utilize a while loop that will terminate when pointers cross.
 */
