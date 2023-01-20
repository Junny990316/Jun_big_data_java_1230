package 인터페이스리모컨;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Television를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) { // 절대 허용범위를 넘지 않겠다는 의미
            this.volume = RemoteControl.MAX_VOLUME; // 최대값을 넘어가면 최대값을 쓴다는 의미
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Television 볼륨 : " + this.volume);
    }
    @Override
    public void getInfo() {
        System.out.println("Television 입니다.");
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("TV를 무음 처리 합니다.");
        else System.out.println("TV를 무음 해제 합니다.");
    }
}
