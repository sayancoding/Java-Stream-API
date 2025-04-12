import java.util.stream.Stream;

public class S1_EmptyStream {

    public static void main(String[] args) {
        Stream<Object> myStream = null;
        System.out.println(myStream);
        if(myStream == null){
            // initialize empty String instead of Null
            myStream = Stream.empty();
            System.out.println(myStream.toString());
        }
    }
}