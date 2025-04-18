package extendes;

public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}

class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("전기차가 이동합니다.");
    }

    public void charge() {
        System.out.println("전기를 충전합니다.");
    }
}

class GasCar extends Car {
    @Override
    public void move() {
        System.out.println("가스차가 이동합니다.");
    }

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}

class HydrogenCar extends Car {
    @Override
    public void move() {
        System.out.println("수소차가 이동합니다.");
    }

    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }
}