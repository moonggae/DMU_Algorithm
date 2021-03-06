package lecture12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public LargestNumber() {
        List<String> numbers = Arrays.asList("10", "68", "75", "7", "21", "12");
        // sort using a custom function object
        Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));
        // print the sorted sequence
        numbers.stream().forEach(System.out::print);

    }
}
