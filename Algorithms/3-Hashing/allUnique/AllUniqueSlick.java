import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class AllUniqueSlick {

  public static boolean allUnique(List<?> items) {
    Set<Object> itemsSet = new HashSet<>(items);

    System.out.println(items.size() == itemsSet.size());
    return items.size() == itemsSet.size();
  }

  public static void main(String[] args) {
    allUnique(List.of("q", "r", "s", "a")); // -> true
    allUnique(List.of("q", "r", "s", "a", "r", "z")); // -> false
    allUnique(List.of("red", "blue", "yellow", "green", "orange")); // -> true
    allUnique(List.of("cat", "cat", "dog")); // -> false
    allUnique(List.of("a", "u", "t", "u", "m", "n")); // -> false
  }
}
