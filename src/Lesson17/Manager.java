package Lesson17;

public class Manager {
    public static void main(String[] args) {
        Thread.currentThread().setName("Концертмейстер: ");
        System.out.println(Thread.currentThread().getName() +
                "\"Концерт начат\"");

        Singer1 singer1 = new Singer1();
        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer1.start();
        singer2.start();

        while (singer1.isAlive()) {

        }

        System.out.println(Thread.currentThread().getName() + "\"Концерт закончен\"");
    }
}
