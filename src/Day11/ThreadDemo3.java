package Day11;

class MyThread2 extends Thread{
    public void start(){
        super.start();
        System.out.println("Hello");
    }
    public void run(){
        System.out.println("Hi");
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread2 t=new MyThread2();
        t.start();
        System.out.println("Hoooooo");
    }
}
