package interface2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = { new Chicken(), new Duck() };
        for (AbstractAnimal animal : animalArr) {
            animal.introduce();
            soundAnimal(animal);
            moveAnimal(animal);
            System.out.println();
        }
    }

    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
