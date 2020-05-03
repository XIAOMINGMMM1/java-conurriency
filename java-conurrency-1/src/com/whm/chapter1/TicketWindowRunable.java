package com.whm.chapter1;

/**
 * @author 353487587@qq.com
 * @date 2020/5/3 23:46
 */
public class TicketWindowRunable implements Runnable {

    private Integer index = 1;
    private static final Integer MAX = 50;
    @Override
    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread().getName()+" 的叫号码："+index++);
        }
    }
}
