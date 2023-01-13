package 상속실습예제;

public class InheritanceMain {
    public static void main(String[] args) {
       Worker woker = new Worker();
       woker.setAge(30);
       woker.setSleep(8);
       woker.getWork();
       System.out.println("직장인이 " + woker.getWork() + "시간 동안 일을 합니다.");
       System.out.println("직장인의 나이는 " + woker.getAge() + "입니다.");
       System.out.println("직장인은 " + woker.getSleep() + "시간 동안 잠을 잡니다.");


       Student student = new Student();
       student.setStudy(1);
       student.setAge(18);
       student.setSleep(6);
        System.out.println("학생은 " + student.getStudy() + "시간 동안 공부를 합니다.");
        System.out.println("학생의 나이는 " + student.getAge() + "입니다.");
        System.out.println("학생은 " + student.getSleep() + "시간 동안 잠을 잡니다.");
    }
}
