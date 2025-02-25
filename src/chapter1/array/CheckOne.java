package chapter1.array;

public class CheckOne {
    public static void main(String[] args) {

        int[] num = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수 : ");
        for (int i = 0; i < num.length; i++) { // 인덱스 번호
            if (num[i] % 2 == 0) { // num 값을 2로 나눈 나머지가 0 = 짝수만
                System.out.print(" " + num[i]);
            }
        }
    }
}
