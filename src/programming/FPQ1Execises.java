package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FPQ1Execises {
    public static void main(String[] args) {

        List<Integer> list = Arrays.stream(new int[]{12, 9, 13, 4, 6, 24, 12, 15}).boxed()
                .collect(Collectors.toList());

        printAllOddNumbersInListLamba(list);

        List<String> courses = Arrays.stream(new String[]{"Spring", "Spring Boot", "API",
                        "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"})
                .collect(Collectors.toList());

        // filter courses that contains Spring
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        // filter courses have at least 4 characters
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

        //print the number of characters in each course name
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);


    }

    private static void printAllOddNumbersInListLamba(List<Integer> list) {
        list.stream()
                .filter(number -> number % 2 != 0) // Lambda expression
                .forEach(System.out::println);
    }

}
