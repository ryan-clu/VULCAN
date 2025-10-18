import java.util.Map;
import java.util.HashMap;

public class MostFreqCharTest {
  public static char mostFrequentChar(String word) {
    Map<Character, Integer> charFreqHash = freqCount(word);

    int currMaxFreq = 0;
    // int minVal = Integer.MIN_VALUE;
    char mostFreqChar = ' ';

    for (char letter : word.toCharArray()) {
      int letterFreq = charFreqHash.get(letter);
      if (letterFreq > currMaxFreq) {
        currMaxFreq = letterFreq;
        mostFreqChar = letter;
      }
    }

    System.out.println("Most freq char: " + mostFreqChar);
    return mostFreqChar;
  }

  public static Map<Character, Integer> freqCount(String givenWord) {
    Map<Character, Integer> charFreqCount = new HashMap<>();

    for (char letter : givenWord.toCharArray()) {
      if (!(charFreqCount.containsKey(letter))) {
        charFreqCount.put(letter, 0);
      }

      charFreqCount.put(letter, charFreqCount.get(letter) + 1);
    }

    return charFreqCount;
  }

  public static void main(String[] args) {
    mostFrequentChar("bookeeper"); // -> 'e'
    mostFrequentChar("david"); // -> 'd'
    mostFrequentChar("mississippi"); // -> 'i'
    mostFrequentChar("eleventennine"); // -> 'e'
  }
}
