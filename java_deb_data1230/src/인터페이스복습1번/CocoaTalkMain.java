package 인터페이스복습1번;

import java.util.Scanner;

public class CocoaTalkMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("Junny");
        cocoaTalk.writeMsg("벌써 여름이 왔어. 잘 지내지?");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]WIFI [2]5G : ");
        int sel = sc.nextInt();
        if (sel == 1) adapter = new WIFI();
        else adapter = new FiveG();
        cocoaTalk.send(adapter);
    }
}
