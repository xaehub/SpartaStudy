package chapter1.operator;

import java.util.Scanner;

public class CheckTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x값을 입력해 주세요 : ");
        int x = sc.nextInt();
        System.out.println("y값을 입력해 주세요 : ");
        int y = sc.nextInt();

        boolean a = x > y;
        boolean b = x < y;
        boolean c = x == y;
        boolean d = x != y;

        System.out.println("x가 y보다 큰가? " + a);
        System.out.println("x가 y보다 작은가? " + b);
        System.out.println("x와 y가 같은가? " + c);
        System.out.println("x와 y가 다른가? " + d);

    }
}
