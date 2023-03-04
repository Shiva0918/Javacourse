import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> mutipleNumbers = numbers.stream()
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Multiple's of 3:" + mutipleNumbers);


        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Maximum value: " + max);

        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println(("Minimum value: " +min));
    }
}
