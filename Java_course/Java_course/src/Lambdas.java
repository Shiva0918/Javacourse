import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;


public class Lambdas {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("Goutham");
        names.add("Shiva");
        names.add("Rahul");


        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });

        System.out.println("Sorted names: " + names);

        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        }

        Function<String, Integer> lengthFunc = s -> s.length();
        int length = lengthFunc.apply(filteredNames.toString());

        System.out.println("Filtered name : " + filteredNames);
        System.out.println("Length of filtered string is: " + length);

    }
}
