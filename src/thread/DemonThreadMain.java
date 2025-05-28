package thread;

public class DemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": run()");
        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(true);
        demonThread.start();
        System.out.println(Thread.currentThread().getName() + "run(): end");
    }

    static class DemonThread extends Thread {
        @Override
        public void run() {
            System.out.println();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run()");
        }
    }
}
