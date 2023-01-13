package 상속실습예제;
// 인간(person)이라는 클래스 생성
// age : 나이 특성을 가짐 (정수값 사용, 케터/세터) - 몇살
// sleep : 잠자는 특성(정수값 사용, 케터/세터) - 몇시간 잠자는지
// 인간으로부터 직장인 생성
// work : 몇시간 일하는지? (정수값 사용, 게터/세터)
// 인간으로부터 학생을 생성
// study : 공부하는 특성 (1로 입력받으면 출력은 "열심히", 2 입력시 "적당히", 3 "놀면서")
public class InheritanceEx1 {
    int age;
    int sleep;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}
class Worker extends InheritanceEx1{
    int work;
    public int getWork() {
        return work;
    }
}
class Student extends InheritanceEx1{
    int study;

    public String  getStudy() {
        String[] studyStr = {",", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];

    }
    public void setStudy(int study){
        this.study = study;
    }
}