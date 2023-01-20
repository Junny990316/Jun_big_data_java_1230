package 인터페이스CocoaTalk;

public interface NetAdepter {
    void connect();
    void send(String msg);
}
class WiFi implements NetAdepter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetAdepter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}