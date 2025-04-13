import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S8_FlatMap {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "hello world",
                "java streams example"
        );

        /*
         * map(logic function) -> that applies for each elements and transform a new element, 
         * But NOT a stream for each element/object
         * we can assume like one-to-one mapping input and output stream
         */
        List<String[]> resultFromMap = sentences.stream()
            .map(s -> s.split(" "))
            .collect(Collectors.toList()); // Each sentence becomes String[]
        resultFromMap.forEach(el-> System.out.println(Arrays.toString(el)));
        // Output:
        // [hello, world]
        // [java, streams, example]


        List<String> resultFromFlatMap = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" "))) 
                /*
                 * flatMap() always take function having stream return that applies all items
                 * first transform each elements to stream (one-to-many mapping) then
                 * merge multiple stream to single stream as result by collect
                 */
                .collect(Collectors.toList());
        System.out.println("\n"+resultFromFlatMap);
        /*
         * Output :
         * [hello, world, java, streams, example]
         */
    }
}