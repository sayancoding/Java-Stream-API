import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class S2_StreamCreation {
    public static void main(String[] args) {

        /* 1. Creating Stream from Array and ArrayList
         */
        String[] namesArr = {"Ram","Sham","Jaddu"};
        Stream<String> streamOfnameA = Arrays.stream(namesArr);

        List<String> namesList = Arrays.asList("Ram","Sham","Jaddu");
        Stream<String> streamOfnameB = namesList.stream();

        /* 2. Creating Stream using Stream Builder
         * Using builder method, we must specify type on right side
         */
        Stream<String> streamOfnameC = Stream.<String>builder()
                                        .add("Tom")
                                        .add("Cheery")
                                        .add("Danial")
                                        .build();
        
        /* 3. Using Generate method
         * generate(supplier/lambda) take a supplier/lambda as an arguments
         * We can define logic inside lambda or supplier
         * limit(int) takes int value as the length of stream
         * Here stream will contain 3 items as value 12 for each
         * like [12,12,12]
          */
        Stream<Integer> numbStream = Stream.generate(()->12).limit(3);
        printStream(numbStream);
        

        /* 
         * 4. Using iterate method
         * iterate(int seed, lambda/supplier)
         * Another way to create Stream like generate() but need to give initial vale as seed 
         * Here previous items will propagate to next item creation in the form of n
         * first value -> 1, second -> 1+1 = 2, third -> 2+1 = 3 likewise [1, 2, 3, 4, 5]
        */
        Stream<Integer> numbStream2 = Stream.iterate(1, (n)-> n+1 ).limit(5);
        printStream(numbStream2);

    }

    public static void printStream(Stream<?> numbStream2){
        System.out.print("Your Stream :: ");
        numbStream2.forEach(n->System.out.print(n+", "));
        System.out.println();
    }
}
