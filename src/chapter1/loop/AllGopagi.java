package chapter1.loop;

public class AllGopagi {
    public static void main(String[] args) {


        for (int a = 2; a < 10; a++) {

            System.out.println("==== " + a + "단 ====");
            for (int b = 1; b < 10; b++) {
                int result = a * b ;
                System.out.println(a + "x" + b + "=" + result );
            }
        }

    }
}
