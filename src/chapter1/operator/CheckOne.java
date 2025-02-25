package chapter1.operator;

import java.util.Scanner;

public class CheckOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a 값을 입력하세요 : ");  // a값 할당
        int a = scanner.nextInt();
        System.out.print("b 값을 입력하세요 : ");  // b값 할당
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 변수에 저장한다면

        int sum = a + b;
        int minus = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("sum = " + sum);
        System.out.println("minus = " + minus);
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);

    }
}
