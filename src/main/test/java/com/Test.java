package com;

/**
 * Created by zhang_htao on 2019/8/31.
 */
public class Test {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        new Thread(threadDemo,"thread线程").start();
        while (true){
            if (threadDemo.isFlag()){
                System.out.println("执行完毕");
                break;
            }
        }
    }

}
class ThreadDemo implements  Runnable{
    private volatile boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println(Thread.currentThread().getName() + "将flag置为" + this.flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
