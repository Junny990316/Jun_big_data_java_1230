package 중첩인터페이스;

import 인터페이스활용.Buy;

public class MassageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
