package chapter2.capulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("ktj");

        // 인스턴스 변수 접근
        // person.name = "ktj";
        // person.secret = "??";

        // 인스턴스 메서드 접근
        // person.methodA();
        // person.methodB();

        // 게터
        String name = person.getName();
        System.out.println("이름: " + name);

        // 세터
        person.setName("Steve");
        String name2 = person.getName();
        System.out.println("이름: " + name2);

    }
}
