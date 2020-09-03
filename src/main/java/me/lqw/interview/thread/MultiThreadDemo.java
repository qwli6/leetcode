package com.qiwen.interview.thread;

import java.util.concurrent.*;

/**
 * 线程池
 * @author liqiwen
 * @since 1.2
 * @version 1.2
 */
public class MultiThreadDemo {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        ExecutorService executorService2 = Executors.newCachedThreadPool();

        ExecutorService executorService3 = Executors.newWorkStealingPool();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 0, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>(20), new ThreadPoolExecutor.CallerRunsPolicy());

        for(int i = 0; i < 200; i++){
            int finalI = i;
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("开始执行任务:" + finalI + " 执行任务的线程:" + Thread.currentThread().getName());
                }
            });
        }
    }
}
