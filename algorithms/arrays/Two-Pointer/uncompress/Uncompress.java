
public class Uncompress {
  
  public static String uncompress(String s){
    int i = 0;
    int j = 0;

    StringBuilder uncompS = new StringBuilder();

    while (j < s.length()){
      char charAtJ = s.charAt(j);

      if (Character.isDigit(charAtJ)){
        j += 1;
      } else {
        int numToAdd = Integer.parseInt(s.substring(i, j));

        for (int k = 0; k < numToAdd; k += 1){
          uncompS.append(charAtJ);
        }

        j += 1;
        i = j;
      }
    }

    System.out.println("This is the uncompressed string... " + uncompS.toString());
    return uncompS.toString();
  }
  public static void main(String[] args) {
    uncompress("2c3a1t"); // -> "ccaaat"
    uncompress("4s2b"); // -> "ssssbb"
    uncompress("2p1o5p"); // -> "ppoppppp"
    uncompress("3n12e2z"); // -> "nnneeeeeeeeeeeezz"
  }
}

/** Approach
 * 
 * Key: Utilize two pointers that start from the beginning 
 * of the string. Format of each "grouping" in string, will 
 * start off with a number - could be double/triple/multidigit.
 * Use pointers to "identify" the number and then identify 
 * character.
 * 
 * Steps:
 * - Utilize a traditional for loop to process entire string.
 * - Utilize two pointers to identify number and letter.
 * - Utilize a loop to add/push letter accordingly to a return
 * string. 
 * 
 * 
 * ✅ substring(int beginIndex, int endIndex)
 */