package interface1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        InterfaceAnimal[] animalArr = { new Cat(), new Dog() };
        for (InterfaceAnimal animal : animalArr) {
            animal.introduce();
            soundAnimal(animal);
            moveAnimal(animal);
            System.out.println();
        }
    }

    public static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
