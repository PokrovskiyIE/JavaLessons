package Lesson10;

public abstract class Animal { // Объекты абстрактного класса создать нельзя, зато можно прописывать методы без тела
    private String name;

    public abstract void vice();

    public abstract void jump();

    public void printName() {
        System.out.println(name);
    }
}
