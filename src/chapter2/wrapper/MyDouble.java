package chapter2.wrapper;

public class MyDouble {
    private final double value;

    public MyDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    // 덧셈
    public MyDouble add(MyDouble other) {
        return new MyDouble(this.value + other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
