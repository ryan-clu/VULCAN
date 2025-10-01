import java.util.Map;
import java.util.HashMap;

public class AnagramsTest {

  // Helper
  public static Map<Character, Integer> charCount(String givenWord){
    Map<Character, Integer> charFreqHash = new HashMap<>();
    char[] wordCharArr = givenWord.toCharArray(); 
    
    for (char character : wordCharArr){
      if (!(charFreqHash.containsKey(character))){
        charFreqHash.put(character, 0);
      }

      charFreqHash.put(character, charFreqHash.get(character) + 1);
    }

    return charFreqHash;
  }

  // Main Driver
  public static boolean anagrams(String word1, String word2){
    Map<Character, Integer> word1Hash = charCount(word1);
    Map<Character, Integer> word2Hash = charCount(word2);
    System.out.println("Strings matching: " + word1Hash.equals(word2Hash));
    return word1Hash.equals(word2Hash);
  }

  public static void main(String[] args){
    anagrams("restful", "fluster"); // -> true
    anagrams("cats", "tocs"); // -> false
  }
}
