
public class Compress {

  public static String compress(String word) {
    word += "!";
    int i = 0;
    int j = 0;

    StringBuilder compressedWord = new StringBuilder();

    while (j < word.length()) {
      if (word.charAt(j) == word.charAt(i)) {
        j += 1;
      } else {
        int compressNum = j - i;

        if (compressNum == 1) {
          compressedWord.append(word.charAt(i));
        } else {
          compressedWord.append(compressNum);
          compressedWord.append(word.charAt(i));
        }

        i = j;
      }
    }

    System.out.println("This is the returned compressed word... " + compressedWord.toString());
    return compressedWord.toString();
  }

  public static void main(String[] args) {
    compress("ccaaatsss"); // -> "2c3at3s"
    compress("ssssbbz"); // -> "4s2bz"
    compress("ppoppppp"); // -> "2po5p"
    compress("nnneeeeeeeeeeeezz"); // -> "3n12e2z"
  }
}

// O(n) T, O(n) S

/*
 * Approach
 * 
 * Key: Utilizing two pointers. Pointers allow we to
 * keep track of indexes, for location purposes, and
 * also allows for comparison of chars/elements at
 * given indices.
 * 
 * Steps:
 * - Two pointers, leading and lagging and utilize
 * a while loop. Loop breaks when leading pointer
 * goes past length of string.
 * - Pointers will compare chars at given points,
 * if chars are different - that is identified as
 * a grouping.
 * - Difference of the two indices on string are the
 * number of times that given char appeared.
 */
