import java.util.List;
import java.util.ArrayList;

public class PairsTest {

  public static List<List<String>> pairs(List<String> array){
    List<List<String>> pairsReturn = new ArrayList<>();

    for (int i = 0; i < array.size(); i += 1){
      for (int j = i + 1; j < array.size(); j +=1){
        pairsReturn.add(List.of(array.get(i), array.get(j)));
      }
    }

    System.out.println("This is pairsReturn" + pairsReturn);
    return pairsReturn;
  }

  public static void main(String[] args){
    pairs(List.of("a", "b", "c"));
  }

}
