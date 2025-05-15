package interface2;

import interface1.Fly;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    void move() {
        System.out.println("닭 이동");
    }

    @Override
    void introduce() {
        System.out.println("저는 닭입니다. 눈은" + DEFAULT_EYE_COUNT + "개 입니다.");
        System.out.println("짧은 거리지만 잠깐 날 수 있습니다.");
    }

    @Override
    public void fly() {
        System.out.println("잠깐 날 수 있지만 멀리 날지는 못합니다.");
    }
}
