import java.util.Arrays;
import java.util.List;

public class S4_StreamReducer {
    public static void main(String[] args) {
        /*
         * Termination Operation/method -
         * Stream reducer() method are used to aggregate/combined stream into single value as result
         * reducer(int initial, accumulator, combiner)
         * 
         * a. identity/initial value -> initial value for accumulation or default value for empty stream
         * 
         * b. accumulator lambda -> a function which specifies the logic of the aggregation of elements. 
         *    As the accumulator creates a new value for every step of reducing, 
         *    the quantity of new values equals the stream’s size and only the last value is useful.
         * 
         * c. combiner lambda ->  a function which aggregates the results of the accumulator. 
         *    We only call combiner in a parallel mode to reduce the results of accumulators from different threads.
         */

         List<Integer> numberList = Arrays.asList(1,2,3); //Stream Creation

        int result1 = numberList.stream().reduce(10,(a, b) -> a + b); 
        System.out.println("result1 : "+result1);
        /*
         * first  10+1 = 11
         * second 11+2 = 13
         * third  13+3 = 16
         * 
         * So Final result will be 16
         */

        int result2 = numberList.parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> a + b);
        System.out.println("result2 : "+result2);

        /*
         * first  10+1 = 11
         * second 10+2 = 12
         * third  10+3 = 13
         * 
         * Combination is 11+12+13 = 36
         * 
         * So Final result will be 36
         */
    }
}
