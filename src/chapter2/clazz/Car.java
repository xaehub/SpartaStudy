package chapter2.clazz;

public class Car {
    // 1. 속성
    String carName;
    int carAge;
    String carColor;

    // 2. 생성자
    Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    // 3. 기능
    public void drive() {
        System.out.println(carAge + "년식 " + carColor + " " + carName + "이(가) 주행합니다.");
    }

    public void accelerate() {
        System.out.println(carAge + "년식 " + carColor + " " + carName + "이(가) 가속합니다.");
    }
}
