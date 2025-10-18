public class IsPalindromeBetter {

  public static boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        System.out.println("The word " + s +" returned... false.");
        return false;
      }
      i += 1;
      j -= 1;
    }

    System.out.println("The word " + s +" returned... true.");
    return true;
  }

  public static void main(String[] args) {
    isPalindrome("pop"); // -> true
    isPalindrome("pops"); // -> false
    isPalindrome("kayak"); // -> true
    isPalindrome("boot"); // -> false
    isPalindrome("rotator"); // -> true
    isPalindrome("abcbca"); // -> false
    isPalindrome(""); // -> true
  }
}
