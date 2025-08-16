
public class IsPalindrome {

  public static boolean isPalindrome(String word) {
    char[] wordArray = word.toCharArray();

    int i = 0;
    int j = wordArray.length - 1;

    while (i <= j) {
      char head = wordArray[i];
      char tail = wordArray[j];

      if (head == tail) {
        i++;
        j--;
      } else {
        System.out.println("The word " + word +" returned... false.");
        return false;
      }
    }

    System.out.println("The word " + word +" returned... true.");
    return true;
  }

  public static void main(String[] args) {
    isPalindrome("pop"); // -> true
    isPalindrome("pops"); // -> false
    isPalindrome("kayak"); // -> true
    isPalindrome("boot"); // -> false
    isPalindrome("rotator"); // -> true
    isPalindrome("abcbca"); // -> false
    isPalindrome(""); // -> true
  }
}

// O(n) T, O(1) S

/**
 * Approach
 * 
 * Key: Loop over the given String, utilizing two pointers - one that starts
 * from the head, and the other that starts from the tail.
 * 
 * Steps:
 * - Convert string toCharArray()
 * - Utilize traditional while loop that track leading head pointer and a tail
 * pointer.
 * - Process chars/elements at each pointer to check for matching. If they don't
 * match then return false.
 * - Loop ends when pointer indexes cross eachother.
 * 
 */