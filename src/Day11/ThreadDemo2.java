package Day11;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
    public void run(int i){
        System.out.println("Hi");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.start();
    }
}
