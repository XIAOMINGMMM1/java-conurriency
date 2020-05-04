package com.whm.chapter1;

/**
 * @author 353487587@qq.com
 * @date 2020/5/3 23:45
 */
public class BankVersion1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=() -> {

        };

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//        threadGroup.enumerate()
        TicketWindowRunable ticketWindowRunable = new TicketWindowRunable();
        Thread thread1 = new Thread(ticketWindowRunable, "窗口1");
        Thread thread2 = new Thread(ticketWindowRunable, "窗口2");
        Thread thread3 = new Thread(ticketWindowRunable, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
       // Thread.currentThread().join();
    }
}
