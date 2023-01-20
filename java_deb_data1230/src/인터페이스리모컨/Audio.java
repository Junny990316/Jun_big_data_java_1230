package 인터페이스리모컨;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
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
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    public void getInfo() {
        System.out.println("Audio 입니다.");
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }
}
