public class altMergeStringsAlt {

  public static String altMergeStrings(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();

    StringBuilder result = new StringBuilder();
    int i = 0, j = 0;

    while (i < m || j < n) {
        if (i < m) {
            result.append(word1.charAt(i));
            i += 1;
        }
        if (j < n) {
            result.append(word2.charAt(j));
            j += 1;
        }
    }

    System.out.println("This is the return string... " + result.toString());
    return result.toString();
}

  public static void main(String[] args) {
    altMergeStrings("abc", "pqr"); // "apbqcr"
    altMergeStrings("abcd", "pq"); // "apbqcd"
  }
}
