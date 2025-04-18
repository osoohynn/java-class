package extendes;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 자식클래스에서 부모쿨래스 함수 사용

        Car car = new Car();
        // car.charge(); // 부모클래스는 자식클래스의 함수를 사용 못함
        car.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
