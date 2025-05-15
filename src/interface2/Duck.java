package interface2;

import interface1.Fly;
import interface1.Swim;

public class Duck extends AbstractAnimal implements Fly, Swim {
    @Override
    void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    void move() {
        System.out.println("오리 이동");
    }

    @Override
    void introduce() {
        System.out.println("저는 오리입니다. 눈은" + DEFAULT_EYE_COUNT + "개 입니다.");
        System.out.println("날 수 있고 수영도 할 수 있습니다.");
    }

    @Override
    public void fly() {
        System.out.println("날개를 퍼덕이며 날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("물 위에서 헤엄칩니다.");
    }
}
