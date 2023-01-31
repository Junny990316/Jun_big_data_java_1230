package HashSet기본;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않음
// 중복 여부 확인은 hashCode()의 리턴값을 이용함 (경우에 따라서 오버라이딩을 한다)
public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1001, "jun"));
        set.add(new Member(1002, "junny"));
        set.add(new Member(1003, "sunyu"));
        Member mem4 = new Member(1004, "suzuka");
        set.add(mem4);
        set.add(new Member(1003, "shunta"));

        for (Member e : set) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("------------------");
        }
    }
}
class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }
//    @Override
//    public boolean equals(Objects obj) {
//        if (obj instanceof Member) {
//            Member member = (Member) obj;
//            if (this.id == member.id) return true;
//            else return false;
//        }
//        return false;
//    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " +name);
    }
}