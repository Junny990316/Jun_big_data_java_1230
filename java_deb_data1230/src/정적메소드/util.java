package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class util {
    public static String getCurrentData(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String DOMAIN = "192.168.0.1";
}
