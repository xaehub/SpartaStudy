package chapter1.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("김태정이 만든 계산기입니다!");
        System.out.print("첫번째 숫자 입력: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int b = sc.nextInt();
        // 1. 객체를 소환 (객체화)
        Calculator calculator = new Calculator();
        // [계산기타입] 계산기상자 = 계산기

        // 2. 메서드(함수)를 호출
        int calSum = calculator.sum(a, b);
        System.out.println(calSum);

        int calMin = calculator.minus(a, b);
        System.out.println(calMin);

        int calMult = calculator.mult(a, b);
        System.out.println(calMult);

        int calDiv = calculator.div(a, b);
        System.out.println(calDiv);

    }
}
