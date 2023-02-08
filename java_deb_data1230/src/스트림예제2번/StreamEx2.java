package 스트림예제2번;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("junny", 89));
        list.add(new Student("kkk", 99));
        list.add(new Student("jjj", 78));

        list.parallelStream().forEach(s->{ // parallelStream : 병렬처리
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score );
        });
        double avg = list.stream().mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("average : " + avg);
    }
}
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
