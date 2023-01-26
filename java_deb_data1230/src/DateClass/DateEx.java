package DateClass;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date() : 1970년 1월 1일 0시 0분 0초에서 현재까지의 경과시간으로 시간 계산(msec), 객체 생성 후 사용
// SimpleDateFormat : 운영체제로 부터 얻어진 시간 정보를 우리가 원하는 포맷으로 변경해서 출력(pattern matching)
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
//        String dateStr = sdf.format(now);
//        System.out.println(dateStr);
        // yyyy : 연도를 4자리로 표현 (2023)
        // yy : 연도를 두자리로 표현 (23)
        // MM : 월을 두자리로 표시(반드시 대문자)
        // hh : 12시간제를 의미
        // HH : 24시간제를 의미
        // mm : 분을 표시 (2자리)
        // W : 월의 몇번째 주
        // w : 연에서 몇번째
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss"); // 24시간제
        f5 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

    }
}
