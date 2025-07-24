import java.util.ArrayList;
import java.util.List;

public class Pairs {
    public static List<List<String>> pairsMethod (List<String> elements) {
        List<List<String>> returnList = new ArrayList<>();
        
        for (int i = 0; i < elements.size(); i += 1) {
            for (int j = i + 1; j < elements.size(); j += 1) {
                List<String> currPair = new ArrayList<>(List.of(elements.get(i), elements.get(j)));
                // List<String> currPair = new ArrayList<>();
                // currPair.add(elements.get(i));
                // currPair.add(elements.get(j));

                returnList.add(currPair);
            }
        }

        System.err.println("This is returnList returned, " + returnList);
        return returnList;
    }

    public static void main(String[] args) {
        pairsMethod(List.of("a", "b", "c"));
        pairsMethod(List.of("a", "b", "c", "d"));
        pairsMethod(List.of("cherry", "cranberry", "banana", "blueberry", "lime", "papaya"));
    }
    
}

// Complexity Analysis: O(n^2) T, O(n^2) S
