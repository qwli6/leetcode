package com.qiwen.interview.thread;

import java.util.concurrent.Callable;

/**
 * 第三种实现方式, 实现 Callable 接口
 * @author liqiwen
 * @version 1.2
 * @since 1.2
 */
public class ThreadDemo3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("第三种线程名称：" + Thread.currentThread().getName());
        return "success";
    }
}
