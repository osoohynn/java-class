package poly;

public class PolyEx1 {
    public static void main(String[] args) {
        System.out.println("다운캐스팅");
        Parent poly1 = new Child();
        Child child = (Child) poly1;
        child.ChildMe();

        System.out.println("일시적 다운캐스팅");
        Parent poly2 = new Child();
        ((Child) poly2).ChildMe();

        System.out.println("업캐스팅");
        Child child2 = new Child();
        Parent parent1 = (Parent) child2;
        Parent parent2 = child2; // 업캐스팅은 명시적 형변환 안 써도 됨
        parent1.ParentMe();
        parent2.ParentMe();

        System.out.println("다운캐스팅 런타임 오류");
        Parent parent3 = new Child();
        Child child3 = (Child) parent3;
        child3.ChildMe();

        Parent parent4 = new Parent();
        Child child4 = (Child) parent4; // 여기 에러
        child4.ChildMe();
    }
}

class PolyEx10 {
    public static void main(String[] args) {

    }
}

class Parent{
    public String name;
    public void ParentMe(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public String name;
    public void ChildMe() {
        System.out.println("Child me");
    }
}