
public class reverseVowelsStringOpt {
  // Return true if the character is a vowel (case-insensitive)
  // private static boolean isVowel(char c) {
  //   return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
  //       || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
  // }

  private static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) >= 0;
  }

  public static String reverseVowelsString(String s){
    if (s == null || s.length() < 2) return s;

    char[] sArr = s.toCharArray();
    int i = 0;
    int j = sArr.length - 1;

    while (i < j){
      // Look for vowel in rear
      while (i < j && !(isVowel(sArr[j]))) j--;
      // Look for vowel in front
      while (i < j && !(isVowel(sArr[i]))) i++;
      
      if (i< j) {
        char forwardChar = sArr[i];
        char rearChar = sArr[j];

        sArr[j] = forwardChar;
        sArr[i] = rearChar;

        j--;
        i++;
      }
    }

    // Convert char[] back to string
    String result = new String(sArr);
    // String result = String.valueOf(sArr);

    System.out.println("This is the return string..." + result);
    return result;
  }

  public static void main(String[] args) {
    reverseVowelsString("IceCreAm"); //"AceCreIm"
    reverseVowelsString("leetcode"); //"leotcede"
  }
}
