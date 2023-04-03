package Day11;

class Thread6 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i am lazy thread" + i);
        }
        System.out.println("i am entering sleeping state");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("i am lazy thread");

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}

public class ThreadSleepMethod {
    public static void main(String[] args) throws InterruptedException {

        Thread6 t=new Thread6();
        t.start();
        t.interrupt(); // main thread interrupts child thread
        System.out.println("end of main thread");

    }
}
