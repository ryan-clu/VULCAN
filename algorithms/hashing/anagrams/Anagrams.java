import java.util.HashMap;

public class Anagrams {
    
    private static boolean anagramsMethod(String word1, String word2) {
        HashMap<Character, Integer> word1freqHash = freqMap(word1);
        HashMap<Character, Integer> word2freqHash = freqMap(word2);

        System.out.println("Are the words anagrams? The answer is... " + word1freqHash.equals(word2freqHash));
        return word1freqHash.equals(word2freqHash);
    }

    private static HashMap<Character, Integer> freqMap(String word) {
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (char letter : word.toCharArray()) {
            if (charFreq.containsKey(letter)) {
                charFreq.put(letter, charFreq.get(letter) + 1);
            } else {
                charFreq.put(letter, 0);
            }
        }

        return charFreq;
    }

    public static void main(String[] args) {
        anagramsMethod("restful", "fluster"); // -> true
        anagramsMethod("cats", "tocs"); // -> false
        anagramsMethod("monkeyswrite", "newyorktimes"); // -> true
        anagramsMethod("elbow", "below"); // -> true
    }
}

// JAVA- O(n+m) T, O(n+m) S

/*
 * Approach
 * - Create a helper function that can be used to process a given
 * String and would generate a HashMap of the freq of each letter char.
 * - The two words that are inputted are "processed" via the
 * helper function and the resulting HashMaps of each word are compared.
 * - If they are equal, which means they have the exact same letters,
 * then return true.
 */


/*
 * Learning Keys
 * 
 * - .equals()
 */
