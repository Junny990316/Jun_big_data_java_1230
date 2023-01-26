package Calendar클래스;
// Calendar class 는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이 하기 때문
// 정적 메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 시준의 정보를 가져옴, 포함된 필드도 전부 클래스 변수

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1);
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));

        // yyyy년MM월dd일 HH시mm분ss초
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DATE);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if (isPM == 1) hour += 12;
        System.out.printf("%d년%d월%d일 %d시%d분%d초\n", year, mon, day, hour,min,sec);

//        System.out.print(now.get(Calendar.YEAR) + "년");
//        System.out.print(now.get(Calendar.MONTH) + 1 + "월");
//        System.out.print(now.get(Calendar.DATE) + "일");
//        System.out.print(" " + now.get(Calendar.HOUR_OF_DAY) + "시");
//        System.out.print(now.get(Calendar.MINUTE) + "분");
//        System.out.print(now.get(Calendar.SECOND) + "초");
    }
}
