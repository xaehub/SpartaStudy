package chapter3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"김태정", "신성록", "박수진"};

        // 배열을 스트림으로 변환
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
}
