package 클론메소드;

// Cloneable 실제 구현해야 할 메소드는 없지만 인터페이스 등록 후 사용, 단 clone() 메소드 사용 가능하도록 권한 부여
public class Member implements Cloneable {
    String id;
    String pwd;
    String name;
    int age;
    boolean isAdult;

    public Member(String id, String pwd, String name, int age, boolean isAdult) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {}
        return cloned;
    }
}
