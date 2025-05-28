package thread;

public class AutosaveMain {
    public static void main(String[] args) {
        Autosave a = new Autosave();
        a.setDaemon(true);
        AutoSaveWrite aw = new AutoSaveWrite();
        aw.start();
        a.start();
    }
}

class Autosave extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("자동 저장 완료!");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class AutoSaveWrite extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("문서 작성 중... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("작업 종료");
    }
}