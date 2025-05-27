import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoe", "Anna", "Mike", "John");

        Collections.sort(names, (a, b) -> a.compareTo(b)); // or just names.sort(String::compareTo);

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}

