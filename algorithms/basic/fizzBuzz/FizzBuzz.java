import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

    public static List<Object> fizzBuzzMethod(int num) {
        List<Object> gameArrList = new ArrayList<>();

        for (int i = 1; i <= num; i += 1) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                gameArrList.add("fizzbuzz");
            } else if (i % 5 == 0) {
                gameArrList.add("buzz");
            } else if (i % 3 == 0) {
                gameArrList.add("fizz");
            } else {
                gameArrList.add(i);
            }
        }

        System.out.println("This is gameArrList returned, " + gameArrList);
        return gameArrList;
    }

    public static void main(String[] args) {
        fizzBuzzMethod(11); 
        fizzBuzzMethod(2); 
        fizzBuzzMethod(16);
    }
}

/*
 * Approach
 * - Utilize a traditional loop that will run from 1 to n.
 * - Will add numbers to an ArrayList, but will first "process" numbers.
 * - If numbers fall under one of the rules, then fizz/buzz/fizzbuzz will
 * be added to ArrayList instead of the number.
 */