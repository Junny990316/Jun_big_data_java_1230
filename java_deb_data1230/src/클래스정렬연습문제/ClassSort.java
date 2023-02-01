package 클래스정렬연습문제;

import java.util.Comparator;

public class ClassSort implements Comparator<StudentInfo> {

    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if (o1.score == o2.score){
            return o1.studentNum.compareTo(o2.studentNum);
        }
        return o2.score - o1.score;
    }
}
