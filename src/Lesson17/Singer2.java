package Lesson17;

public class Singer2 extends Thread{

    @Override
    public void run() {
        Thread.currentThread().setName("Певец 2: ");
        while (true) {
            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "FA----");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitor.MICROPHONE) {
                Monitor.MICROPHONE.notify();
            }

        }
    }
}
