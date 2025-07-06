package thread;

public class ThreadX1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()-> System.out.println("t1"));
        Thread t2=new Thread(()-> System.out.println("t2"));
        t2.setPriority(10);
        t1.setPriority(1);
        t1.start();
        t2.start();
    }
}
