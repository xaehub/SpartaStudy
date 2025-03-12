package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김태정", "이준호", "박수진");

        // 스트림 생성
        Stream<String> stream = names.stream();

        // 스트림 사용 (출력)
        stream.forEach(System.out::println);
    }
}