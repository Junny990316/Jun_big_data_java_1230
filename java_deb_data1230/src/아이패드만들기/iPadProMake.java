package 아이패드만들기;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

import static java.lang.Thread.sleep;

public class iPadProMake {
    int screen; // 화면크기에 대한 정보 : 11인치, 12.9인치
    int color; // 생상 : 스페이스그레이, 실버
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : W-FI, WI-Fi + cellular
    String name ; // 각인서비스 시 이름 저장
    String productData; // 제품 생산 일자(시리얼넘버를 만들 때 사용)
    String serialNum; // 제품 일련번호 : iPad+화면크기+메모리+네트워크타입+일자 (iPad13128C2301121)
    static int cnt = 0; // 플랙스 변수 : 객체 생성 시 생성되지 않고 클래스 생성 시 만들어짐
    iPadProMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productData = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간 정보를 가져옴
        cnt++; // 생성자는 객체가 만들어 질 때 호출 되므로 생성된 객체의 횟수를 확인하는 용도로 사용
        productData += cnt; // 연월일 + 생산갯수

    }
    // 제품 구매에 대한 진행 여부를 묻는 메뉴 만들기
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구입하기 ====");
        System.out.print("구입 하시려면 Yes / 종료는 Quite : ");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("Yes")) return true;
        return false;
    }
    // 화면 크기 정하기
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1]11인치, [2]12.9인치 :  ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return; // 여기서 해당 메소드가 끝남
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 [1]스페이스 그레이, [2]실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택하세요. ");
        }
    }
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요. ");
        }
    }
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 [1]WI-Fi, [2]WI-FI + Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요. ");
        }
    }
    void setName() {
        Scanner sc = new Scanner(System.in);

            System.out.print("각인 서비스 선택 Yes, No");
            String service = sc.next();
            if (service.equalsIgnoreCase("yes")) {
                System.out.print("이름을 입력하세요 : ");
                name = sc.next();

        }

        }
        // 일련 번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C + 230112 + 생산댓수
        void setSerialNum() {
            String screenStr = (screen == 1) ? "11" : "13";
            String[] memStr = {"", "128", "256", "512", "1024"};
            String netStr = (network == 1) ? "W" : "C";
            serialNum = "iPad" + screenStr + memStr[memory] + netStr + productData;

        }
        // 제품 구매가 완료 되면 출고까지 30초 대기 이후 출고 하기
    void inProductPad() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if (cnt >= 100) break;
        }
    }
    void productPad() {
        final String[] scrType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "WI-FI", "Wi-FI+Cellular"};
        System.out.println("==== iPad Pro가 출고 되었습니다. ====");
        System.out.println("디스플레이 : " + scrType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호(S/N) : " + serialNum);
        System.out.println("---------------------------------------");
    }
}
