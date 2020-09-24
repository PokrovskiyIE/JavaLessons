package Lesson17;

public class NextThread implements Runnable {
    @Override

    public void run() {
        while (true) {
            for (int i = 1000; i < 1020; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
