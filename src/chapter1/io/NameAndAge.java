package chapter1.io;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        // Scanner 객체 소환
        Scanner scanner = new Scanner(System.in);  // 이게 있어야 입력을 받을 수가 있당께요

        // 이름 입력
        System.out.print("이름을 입력해 주세요: ");
        String nameBox = scanner.nextLine();

        // 나이 입력
        System.out.print("나이를 입력해 주세요: ");
        int ageBox = scanner.nextInt();

        // 이름 나이 출력
        System.out.println("이름: " + nameBox + "\n나이: " + ageBox);

    }
}
