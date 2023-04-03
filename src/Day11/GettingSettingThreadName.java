package Day11;

class Thread1 extends Thread {
    public  void run(){
        System.out.println("run method executed by: " + Thread.currentThread().getName());
    }
}

public class GettingSettingThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 t = new Thread1();
        System.out.println(t.getName());
        t.start();
        System.out.println("main method executed by: " + Thread.currentThread().getName());
//        Thread.currentThread().setName("Rujan");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(10 / 0);
    }
}
