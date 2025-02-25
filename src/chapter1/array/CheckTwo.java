package chapter1.array;

public class CheckTwo {
    public static void main(String[] args) {
        int[] num = {2, 5, 8};
        int sum = 0;

        System.out.print("누적합: ");

        for (int i = 0; i < num.length; i++) {
            sum += num[i]; // 누적합구하기
        }
        System.out.println(sum);
    }
}
