package chapter1.loop;

import java.util.Scanner;

public class Gopagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력해 주세요(2단 ~ 9단) : ");
        int a = sc.nextInt();

        System.out.println("==== " + a + "단 ====");

        for ( int i = 1; i < 10; i++) { // for문
            int result = a * i ;
            System.out.println(a + "x" + i + "=" + result );
        }

        int b = 1; // while문
        while (b < 10) {
            System.out.println(a + "x" + b + "=" + a * b);
            b++;
        }
    }
}
