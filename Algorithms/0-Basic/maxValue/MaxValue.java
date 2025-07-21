public class MaxValue {

    public static double maxValueAlgo(double[] nums) {
        double maxVal = Double.NEGATIVE_INFINITY;

        for (double num : nums) {
            if (num >= maxVal) {
                maxVal = num;
            }
        }

        System.out.println("This is maxVal returned, " + maxVal);
        return maxVal;
    }

    public static void main(String[] args) {

        double[] numbers = { 4, 7, 2, 8, 10, 9 }; // -> 10
        maxValueAlgo(numbers);
        
        double[] numbers1 = { 10, 5, 40, 40.3 }; // -> 40.3
        maxValueAlgo(numbers1);

        double[] numbers2 = { -5, -2, -1, -11 }; // -> -1
        maxValueAlgo(numbers2);

        double[] numbers3 = { 2, 5, 1, 1, 4 }; // -> 5
        maxValueAlgo(numbers3);

    }

}
