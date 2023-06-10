package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FPQ1Structured {
    public static void main(String[] args) {
        List<Integer> list = Arrays.stream(new int[]{12, 9, 13, 4, 6, 24, 12, 15}).boxed()
                .collect(Collectors.toList());

        printAllNumbersInListStructure(list);

    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListStructure(List<Integer> list) {
        list.stream()
                .forEach(FPQ1Structured::print);
    }
}
