package Day11;

class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class ThreadYieldMethod {
    public static void main(String[] args) {
        Thread3 t=new Thread3();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
