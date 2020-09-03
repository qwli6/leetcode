package com.qiwen.interview.thread;

import java.io.Serializable;

/**
 * 第二种实现方式, 实现 Runnable 接口
 * @author liqiwen
 * @version 1.2
 * @since 1.2
 */
public class ThreadDemo2 implements Runnable {
    @Override
    public void run() {

        System.out.println("第二种方式实现线程:" + Thread.currentThread().getName());
    }
}
