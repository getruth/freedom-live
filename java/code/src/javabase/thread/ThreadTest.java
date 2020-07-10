package javabase.thread;


public class ThreadTest {
    public static void main(String[] args) {
        ThreadLocal<Bank> bank = ThreadLocal.withInitial(()-> new Bank(100, 1000));
        System.out.println(bank.get().getTotalBalance());
    }
}
