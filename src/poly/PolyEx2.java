package poly;

public class PolyEx2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal: animals) {
            soundAnimal(animal);
        }
    }

    byte a = 2;
    byte b = 3;
    int d = a + b;

    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("----------------");
    }
}

class Animal {
    public void sound() {
        System.out.println("sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("음메");
    }
}