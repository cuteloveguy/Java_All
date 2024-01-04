package day109;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // 启动线程
        // 不会启动线程，不会分配新的分支栈。（这种方式就是单线程。）
        t.run();
//        t.start();
        // 这里的代码还是运行在主线程中。
        for(int i = 0; i < 5; i++){
            System.out.println("主线程--->" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 编写程序，这段程序运行在分支线程中（分支栈）。
        for(int i = 0; i < 10; i++){
            System.out.println("分支线程--->" + i);
        }
    }
}
