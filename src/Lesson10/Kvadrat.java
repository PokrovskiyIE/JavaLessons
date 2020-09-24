package Lesson10;

public class Kvadrat implements Figura, Tovar{
    private double sideA;

    public Kvadrat() {
    }

    public Kvadrat(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double perimeter() {
        return sideA * 4;
    }

    @Override
    public double ploshad() {
        return sideA * sideA;
    }

    @Override
    public void buy() {
        System.out.println("Квадрат продан");
    }
}

// Krug krug = new Krug(); // доступны все методы круга и выше
// Object krug = new Krug(); // доступны все методы объекта и выше
// Figura krug = new Krug(); // доступны все методы фигуры и выше
