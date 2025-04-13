import java.util.Arrays;
import java.util.stream.IntStream;

public class S7_ParallelStream {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        IntStream numStream = Arrays.stream(numbers);

        /*
         * Parallel Stream help to execute stream in parallel manner with multiple thread
         * and make use of multiple processor cores 
         * using help of forkJoinPool api
         * 
         * Applicable where order is not important but need quick process on large data set
         * 
         */
        int result = numStream.parallel().reduce(15,(a,b)->{
            System.out.println(Thread.currentThread().getName() + " a : "+a+", b : "+b);
            return a+b;
        });
        System.out.println("final result :: " + result);
    }
}

/*
 * ForkJoinPool.commonPool-worker-1 a : 15, b : 2
 * ForkJoinPool.commonPool-worker-2 a : 15, b : 5
 * main a : 15, b : 3
 * ForkJoinPool.commonPool-worker-1 a : 15, b : 4
 * ForkJoinPool.commonPool-worker-1 a : 19, b : 20
 * ForkJoinPool.commonPool-worker-1 a : 18, b : 39
 * ForkJoinPool.commonPool-worker-3 a : 15, b : 1
 * ForkJoinPool.commonPool-worker-3 a : 16, b : 17
 * ForkJoinPool.commonPool-worker-3 a : 33, b : 57
 * final result :: 90
 */
