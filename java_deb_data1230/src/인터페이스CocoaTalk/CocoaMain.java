package 인터페이스CocoaTalk;
import java.util.Scanner;
// CocoaTalk 은 우리가 만들어야 하는 부분
// send() 기능이 호출되면 적절한 네트워크가 연결되 입력한 메시지를 수신할 대상자에게 전달하는 형태
public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("2NE1");
        cocoaTalk.writeMeg("오늘 춥다:(");
        NetAdepter adepter;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 선택 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if (sel== 1) adepter = new WiFi();
        else adepter = new FiveG();
        cocoaTalk.send(adepter);

    }
}
