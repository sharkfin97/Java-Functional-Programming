package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = Arrays.stream(new String[]{"apple", "banana", "mango"})
                .collect(Collectors.toList());

        Predicate<? super String> predicate = fruit -> fruit.startsWith("c");
        Optional<String> findFirst= fruits.stream().filter(predicate).findFirst();

        System.out.println(findFirst);
        System.out.println(findFirst.isPresent());
        System.out.println(findFirst.get());

    }
}
