package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김태정", "이준호", "박수진");

        // "김"으로 시작하는 이름만 필터링
        List<String> result = names.stream()
                .filter(name -> name.startsWith("김"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}