import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueIdGenerator {
    public static void main(String[] args) {
        // Create an infinite stream of unique IDs
        Stream<Long> uniqueIdStream = Stream.generate(new AtomicLong()::getAndIncrement);

        // Limit the stream to generate the first 10 unique IDs
        // You can change the limit to generate as many as you need
        Stream<Long> first10UniqueIds = uniqueIdStream.limit(10);

        // Collect the unique IDs into a list
        // In a real application, you might use them differently (e.g., database insertion)
        // Here, we collect them into a list just to demonstrate the result
        var uniqueIdList = first10UniqueIds.collect(Collectors.toList());

        // Print the generated unique IDs
        uniqueIdList.forEach(System.out::println);
    }
}

