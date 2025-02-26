package chapter2.polymorphism;

public class Dog implements Animal {
    @Override
    public void exist() {
        System.out.println("강아지가 존재합니다");
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    public void wag() {
        System.out.println("꼬리 흔들기");
    }
}
