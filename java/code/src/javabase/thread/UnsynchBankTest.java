package javabase.thread;

public class UnsynchBankTest {
    public static final int N = 100;
    public static final double INIT_BALANCE = 1000.0;
    public static final double MAX_COUNT = 1000.0;
    public static final int DELAY = 1000;

    public static void main(String[] args) {
        var bank = new Bank(N, INIT_BALANCE);
        for (int i = 0; i < N; i++) {
            int fromAccount = i;
            Runnable r = ()->{
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_COUNT *Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int)(DELAY * Math.random()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };
            var t = new Thread(r);
            t.start();
        }
    }
}
