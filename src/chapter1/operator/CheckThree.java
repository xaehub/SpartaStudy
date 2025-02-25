package chapter1.operator;

import java.util.Scanner;

public class CheckThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 문자열을 입력해 주세요 : ");
        String str1 = sc.nextLine();
        System.out.println("두번째 문자열을 입력해 주세요 : ");
        String str2 = sc.nextLine();

        boolean result = str1.equals(str2);
        System.out.println("두 문자열이 같은가요? " + result);

    }
}
