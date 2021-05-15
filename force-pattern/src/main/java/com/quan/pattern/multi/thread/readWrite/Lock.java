package com.quan.pattern.multi.thread.readWrite;

public interface Lock {

    // 获取显示锁，没有获得锁的线程将被阻塞
    void lock() throws InterruptedException;

    // 释放获取的锁
    void unlock();
}
