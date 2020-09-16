package Thread.tongxun;

import javax.swing.*;
/**线程通讯：两个线程一起打印出1-100.交替打印
* wait(): 当前线程进入阻塞，并释放同步监听器（sleep不会释放，sleep可以任何场景下调用，wait必须在同步调用的时候用）
 * notify():唤醒一个wait的线程，先优先级高的线程
* */
public class CommunicationTest {
    public static void main(String[] args) {
        Number number=new Number();
        Thread t1=new Thread(number);
        Thread t2=new Thread(number);

        t1.setName("线程1:");
        t2.setName("线程2:");

        t1.start();
        t2.start();
    }

}

class Number implements Runnable{
    private int number=1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (number <=100) {
                System.out.println(Thread.currentThread().getName()+":"+number);
                number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else
                break;
         }
        }
    }
}