package Day11;

class Thread5 extends Thread{
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
        }
    }
}
public class ThreadJoinMethod2 {
    public static void main(String[] args) throws InterruptedException {
        Thread5.mt=Thread.currentThread();
        Thread5 t=new Thread5();
        t.start();
//        t.join(); // The parogram will pause/stuck (deadlock)
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
