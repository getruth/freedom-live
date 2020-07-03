package head.first.java.chapter15;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        go();
        for (int i =0 ;i < 25; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    private synchronized void go() {
        System.out.println("thread!");
    }
}
public class ThreadTestDrive {
    public void go() {
        try {
            Runnable threadJob = new MyRunnable();
            Thread thread = new Thread(threadJob);
            Thread another = new Thread(threadJob);
            thread.setName("test");
            another.setName("another");
            thread.start();
            another.start();
            Thread.sleep(10);
            System.out.println("main");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
