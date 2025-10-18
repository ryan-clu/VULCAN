import java.util.HashMap;
import java.util.Map;

public class MostFreqChar {

  // Driver Function
  public static char mostFreqChar(String word) {

    Map<Character, Integer> wordCharFreq = charFreq(word);
    char mostFreqLetter = '\0'; // null character
    int currMaxFreq = 0;

    for (char letter : word.toCharArray()) {
      int letterFreq = wordCharFreq.get(letter);

      if (letterFreq > currMaxFreq) {
        currMaxFreq = letterFreq;
        mostFreqLetter = letter;
      }
    }

    System.out.println("The most freq char is... " + mostFreqLetter);
    return mostFreqLetter;
  }

  // Helper Function
  public static Map<Character, Integer> charFreq(String wordInput) {
    Map<Character, Integer> charFreqHM = new HashMap<>();

    for (char letter : wordInput.toCharArray()) {
      // charFreqHM.put(letter, charFreqHM.getOrDefault(letter, 0) + 1);
      if (!(charFreqHM.containsKey(letter))) {
        charFreqHM.put(letter, 0);
      }

      charFreqHM.put(letter, charFreqHM.get(letter) + 1);
    }

    return charFreqHM;
  }

  public static void main(String[] args) {
    mostFreqChar("bookeeper"); // -> 'e'
    mostFreqChar("david"); // -> 'd'
    mostFreqChar("mississippi"); // -> 'i'
    mostFreqChar("eleventennine"); // -> 'e'
  }
}

// O(2n) T, O(n) S

/*
 * Approach
 * 
 * - Loop over each char of the inputted word and capture
 * the freq of each unique char of the word in a HashMap.
 * - Loop over the letters of the word again (because we want
 * to process the letters of the word in order) to see which 
 * letter has the highest frequency according to our HashMap. 
 */

/*
 * Learning Keys
 * 
 * - char type null character
 * - keySet(), entrySet()
 * 
*/

