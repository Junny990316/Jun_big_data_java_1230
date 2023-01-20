package 상속과인터페이스;

import 인터페이스네트워크.NetworkAdapter;

public class Chat {
    Chat() {}
    void sendMsg() {
        System.out.println("메시지를 보냅니다.");
    }
    void rcdMsg() {
        System.out.println("메시지를 받습니다.");
    }
}

class FiveG extends Chat implements NetworkAdapter2 {
    String company;
    String name;

    public FiveG(String company, String name) {
        this.company = company;
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결 되었습니다.");
    }
    @Override
    void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    @Override
    void rcdMsg() {
        System.out.println(name + "으로 부터 메시지를 받습니다.");
    }
}
class WiFi extends Chat implements NetworkAdapter2 {
    String company;
    String name;

    public WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결 되었습니다.");
    }
    @Override
    void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    @Override
    void rcdMsg() {
        System.out.println(name + "으로 부터 메시지를 받습니다.");
    }
}
