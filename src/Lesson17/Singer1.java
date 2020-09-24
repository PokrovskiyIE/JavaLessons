package Lesson17;

public class Singer1 extends  Thread{
private boolean needToStop = false;

    @Override
    public void run() {
        Thread.currentThread().setName("Певец 1: ");
        int count = 0;
        while (!needToStop) {
            for(int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "----LA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count >3) {
                needToStop = true;
            }

            synchronized (Monitor.MICROPHONE) {
                Monitor.MICROPHONE.notify();
            }
            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
