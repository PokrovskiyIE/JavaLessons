package Lesson10;

public class
Main {
    public static void main(String[] args) {
        //Krug krug1 = new Krug(5); // кроме методов объекта доступны методы круга, фигуры, товара
        //Figura krug2 = new Krug(3); // кроме методов объекта доступны методы фигуры
        //Tovar krug3 = new Krug(2); // кроме методов объекта доступны методы товара

        Kvadrat kvadrat1 = new Kvadrat();
        Kvadrat kvadrat2 = new Kvadrat();
        Kvadrat kvadrat3 = new Kvadrat();

        Krug krug1 = new Krug();
        Krug krug2 = new Krug();
        Krug krug3 = new Krug();

        Figura [] figures = new Figura[6];
        figures[0] = kvadrat1;
        figures[1] = kvadrat2;
        figures[2] = kvadrat3;
        figures[3] = krug1;
        figures[4] = krug2;
        figures[5] = krug3;

        for (Figura f: figures) { //что такое полиморфизм?
            f.buy();
        }
        // Полиморфизм - свойство java работать с разными типами данных как с одним и тем же
    }
}
