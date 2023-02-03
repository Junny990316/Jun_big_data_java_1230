package 쓰레드예제8번;

import static java.lang.Thread.sleep;

// DaemonThread : 다른 스레드의 작업을 돕는 보조 스레드 입니다. 다른 스레드가 모두 종료되면 자동으로 종료됨
// 스레드를 start() 하기 전에 setDaemon(true) 설정만 하면 됨
public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // DaemonThread 설정
        autoSaveThread.start();
        sleep(30000);
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장 함");
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }

}