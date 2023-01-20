package 인터페이스CocoaTalk;
// 메신저 기능에 대한 클래스
public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 전달 할 메시지
    public CocoaTalk(String name) { // 생성자 호출 시 상대방 이름
        to = name;
    }
    public void writeMeg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdepter na) {
        na.send(msg);
    }
}
