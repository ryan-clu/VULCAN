import java.util.HashMap;
import java.util.Map;

public class MostFreqChar {

  // Driver Function
  public static char mostFreqChar(String word) {

    char mostFreqLetter = '\0'; // null character
    int currMaxFreq = 0;

    Map<Character, Integer> wordCharFreq = charFreq(word);

    // for (Character key : wordCharFreq.keySet()) {};
    for (Map.Entry<Character, Integer> entry : wordCharFreq.entrySet()) {
      char letterKey = entry.getKey();
      int freqValue = entry.getValue();

      if (freqValue > currMaxFreq) {
        currMaxFreq = freqValue;
        mostFreqLetter = letterKey;
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
 * - Loop over each char of the inputted word and capture
 * the freq of each char in a HashMap.
 * - Loop over the keys (chars of word) of the HashMap
 * and the highest freq character gets returned.
 */

