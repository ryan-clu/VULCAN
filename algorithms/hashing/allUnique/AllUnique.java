import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class AllUnique {

  public static boolean allUnique(List<?> list) {
    Set<Object> seen = new HashSet<>();

    for (Object element : list) {
      if (seen.contains(element)) {
        System.out.println("Return value is... false");
        return false;
      } else {
        seen.add(element);
      }
    }

    System.out.println("Return value is... true");
    return true;
  }

  public static void main(String[] args) {
    allUnique(List.of("q", "r", "s", "a")); // -> true
    allUnique(List.of("q", "r", "s", "a", "r", "z")); // -> false
    allUnique(List.of("red", "blue", "yellow", "green", "orange")); // -> true
    allUnique(List.of("cat", "cat", "dog")); // -> false
    allUnique(List.of("a", "u", "t", "u", "m", "n")); // -> false
  }
}

/*
 * Approach
 * 
 * Key: Utilize a HashSet to quickly identify if I've
 * previously seen a given element.
 * 
 * Steps:
 * - Loop over all elements of provided list and process
 * each element.
 * - If element has not previously been seen, then add
 * to a Hash Set that is used to track seen elements. Loop
 * can proceed.
 * - If element has previously been seen then break out
 * of loop and return false.
 * - Late return true if entire list is processed.
 */