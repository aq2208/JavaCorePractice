package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        fruits.forEach(System.out::println);

        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> AFruits = fruits.stream().filter((obj) -> obj.startsWith("A")).toList();
        System.out.println(AFruits.get(0));
    }
}
