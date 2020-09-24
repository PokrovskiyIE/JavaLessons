package Lesson15;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        try {
            people.setAge(-200);
            System.out.println("Все хорошо");
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
            System.out.println("Не тот возраст");
        }
        System.out.println("С трай-кетч программа не прерывается");
    }
}
