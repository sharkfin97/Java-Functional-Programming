package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FPQ1Structured {
    public static void main(String[] args) {
        List<Integer> list = Arrays.stream(new int[]{12, 9, 13, 4, 6, 24, 12, 15}).boxed()
                .collect(Collectors.toList());

        printAllNumbersInListStructure(list);
        printAllNumbersInListLamba(list);

        printAllSquareOfEvenInListLamba(list);
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static void printAllNumbersInListStructure(List<Integer> list) {
        list.stream()
                .filter(FPQ1Structured::isEven) // filter allow only even number
                .forEach(System.out::println);
    }

    private static void printAllNumbersInListLamba(List<Integer> list) {
        list.stream()
                .filter(number -> number % 2 == 0) // Lambda expression
                .forEach(System.out::println);
    }

    private static void printAllSquareOfEvenInListLamba(List<Integer> list) {
        list.stream()
                .filter(number -> number % 2 == 0) // Lambda expression
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
