import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class S6_TerminationOps {
    public static void main(String[] args) {
        List<Integer> numberList1 = Arrays.asList(4,3,7,12,10,35,24);

        /*
         * Count() - count items in a stream
         */
        long count = numberList1.stream().count();
        System.out.println("Count : "+count);

        /*
         * max() and min() and avg()
         */
        Optional<Integer> maxItem = numberList1.stream().max((a,b)-> a.compareTo(b));
        System.out.println("Max : " + maxItem.get());

        Optional<Integer> minItem = numberList1.stream().min((a,b)-> a.compareTo(b));
        System.out.println("Min : " + minItem.get());

        /*
         * if we want to use a stream with a boxed Integer value, 
         * we must first convert the stream into IntStream using the mapToInt method.
         */
        OptionalDouble avg = numberList1.stream().mapToInt(Integer::intValue).average();
        System.out.println("Average : " + avg.getAsDouble());
        
        /*
         * anyMatch(condition)  -> true, if atleast one item satisfy condition
         * allMatch(condition)  -> true, if all items satisfy condition
         * noneMatch(condition) -> true, if all item does not satisfy the condition
         */
        boolean isContainAnyEven = numberList1.stream().anyMatch(el -> el % 2 == 0);
        System.out.println("isContainAnyEven : "+ isContainAnyEven);

        boolean isContainAllEven = numberList1.stream().allMatch(el -> el % 2 == 0);
        System.out.println("isContainAllEven : "+ isContainAllEven);

        boolean hasAllPositive = numberList1.stream().noneMatch(el -> el < 0);
        System.out.println("hasAllPositive : "+ hasAllPositive);

        
    }
}
