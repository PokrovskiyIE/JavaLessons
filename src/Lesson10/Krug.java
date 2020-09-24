package Lesson10;

public class Krug implements Figura, Tovar{ // если есть implements - надо реализовать все методы интерфейса
    private int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * radius * radius;
    }

    @Override
    public void buy() {
        System.out.println("Круг продан");
    }
}
