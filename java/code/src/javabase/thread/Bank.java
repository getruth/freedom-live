package javabase.thread;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private ReentrantLock bankLock = new ReentrantLock();
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }
    public void transfer(int from, int to, double amount) {
        bankLock.lock();
        try {
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f %n", getTotalBalance());
        }
        finally {
            bankLock.unlock();
        }
    }
    public double getTotalBalance() {
        double sum = 0.0;
        for (var v : accounts) {
            sum += v;
        }
        return sum;
    }
    public int size() {
        return accounts.length;
    }
}
