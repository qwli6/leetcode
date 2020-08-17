package com.qiwen.interview;

/**
 * StringBuffer 线程安全
 * @author liqiwen
 * @version 1.2
 * @since 1.2
 */
public class StringBufferDemo {

    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < 10 ; i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0; j < 1000; j++){
                        stringBuffer.append("a");
                    }
                }
            }).start();
        }

        Thread.sleep(200);
        System.out.println("StringBuffer 的长度为:" + stringBuffer.length());

    }
}
