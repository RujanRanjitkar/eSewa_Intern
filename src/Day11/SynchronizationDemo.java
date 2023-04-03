package Day11;

class Display{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.println("Good Morning");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
class Thread7 extends Thread{
    Display d;
    String name;

    public Thread7(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    public  void run(){
        d.wish(name);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Display d=new Display();
        Thread7 t1=new Thread7(d, "Rujan");
        Thread7 t2=new Thread7(d, "Ram");
        t1.start();
        t2.start();
    }
}
