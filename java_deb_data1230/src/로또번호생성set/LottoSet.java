package 로또번호생성set;

import java.util.HashSet;

// Set을 이용한 중복 제거
// Set은 중복값을 허용하지 않음
public class LottoSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int)((Math.random() * 45) + 1);
            set.add(tmp);
            if (set.size() == 6) break;
        }
        System.out.println(set);
    }
}
