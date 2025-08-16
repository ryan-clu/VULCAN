public class mergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.max(lenWord1, lenWord2); i++){
            if (i < lenWord1) {
                sb.append(word1.charAt(i));
            }
            if (i < lenWord2) {
                sb.append(word2.charAt(i));
            }
        };
        
        System.out.println("This is the return string... " + sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
      mergeAlternately("abc", "pqr"); //"apbqcr"
      mergeAlternately("abcd", "pq"); //"apbqcd"
    }

}
