package ch09.quiz1;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}