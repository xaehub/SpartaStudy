package chapter3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 54, 134, 435, 15, 39, 4, 1, 2, 791);

        numbers.stream()            // 오름차순 정렬
                .sorted()
                .forEach(System.out::println);
    }
}

