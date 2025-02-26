package chapter2.interfaceexample.test;

public class Main implements OnAndOff {

    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
