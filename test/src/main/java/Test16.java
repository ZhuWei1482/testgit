/**
 * 廖雪峰博客java学习
 * 多线程
 *
 * @Author ZhuWei
 * @Date 2020/2/7 18:09
 * @Version 1.0
 */
public class Test16 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("main stard..");
        Thread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10);
        thread.interrupt();
        thread.join(); // 等待t线程结束
        System.out.println("main end..");
    }

}
class  MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread start..");
        System.out.println("Thread end..");
    }

    
}


