import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestWord {

    public static String longestWordMethod(String sentence) {
        String biggestWord = "";

        String[] sentenceArr = sentence.split("\\s+");
        List<String> sentenceArrList = new ArrayList<>(Arrays.asList(sentenceArr));

        for (String word : sentenceArrList) {
            if (word.length() >= biggestWord.length()) {
                biggestWord = word;
            }
        }

        System.out.println("This is the longestWord return, " + biggestWord);
        return biggestWord;
    }

    public static void main(String[] args) {

        longestWordMethod("what a wonderful world"); // -> "wonderful"
        longestWordMethod("have a nice day"); // -> "nice"
        longestWordMethod("the quick brown fox jumped over the lazy dog"); // -> "jumped"

    }

}

/*
Complexity Analysis: O(n) T, O(n) S
Time grows with size of sentence, space is used for making array and it grows with size of sentence
*/ 

/*
 * NOTES
 * 
 * Use a regular expression to split on one or more spaces:
 * String[] words = sentence.split("\\s+");
 * 
 * split(" "): basic, but fails with multiple spaces.
 * split("\\s+"): preferred for splitting on any whitespace (space, tab, etc.).
 * 
 * When you use the split() method in Java, it returns a REGULAR ARRAY of
 * String.
 * 
 * String sentence = "Java is powerful";
 * String[] words = sentence.split(" ");
 * 
 * Here, words is a standard Java array of type String[].
 * 
 * You can:
 * - Access elements with words[0], words[1], etc.
 * - Use .length to get the number of elements.
 * - Use it in a for or enhanced for-each loop.
 * 
 * Important:
 * It is NOT an ArrayList or any other collection — just a NATIVE Java array.
 * 
 * If you want to convert it to a list (for more flexible operations), you can
 * do:
 * List<String> wordList = Arrays.asList(sentence.split(" "));
 * 
 */
