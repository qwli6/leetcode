package com.qiwen.interview.thread;

/**
 * 第一种实现方式, 继承 Thread
 * @author liqiwen
 * @version 1.2
 * @since 1.2
 */
public class ThreadDemo1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("当前线程名称:" + this.getName());
    }
}