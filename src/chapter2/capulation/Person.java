package chapter2.capulation;

public class Person {

    // 속성
    public String name;
    private String secret;       // 외부에서 접근 x

    // 생성자
     public Person(String name) {
         this.name = name;
     }


    // 기능
    public void methodA() {}
    private void methodB() {}

    // 게터
    public String getName() {
         return name;
    }

    // 세터

    public void setName(String name) {
        this.name = name;
    }
}
