package 쓰레드예제5번;
// Thread에서 공통으로 사용하는 클래스 생서
// synchronized : 멀티스레드 환경에서 동시 접속이 허용되지 않도록 lock을 거는 작업을 의미함
public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Tread의 methodA() 작업 실행");
        notify(); // 일시정시 상태에 있는 TreadB를 실행 대기 상태로 전환
        try{
            wait(); // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {}
    }
    public synchronized void methodB() {
        System.out.println("Tread의 methodB() 작업 실행");
        notify(); // 일시정시 상태에 있는 TreadB를 실행 대기 상태로 전환
        try{
            wait(); // ThreadB를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {}
    }
}
