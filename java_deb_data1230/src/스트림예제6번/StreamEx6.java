package 스트림예제6번;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// Stream 최종연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모해 결과를 출력
public class StreamEx6 {
    public static void main(String[] args) {
        // 요소의 출력
        Stream<String> stream = Stream.of("하나", "둘", "셋", "넷");
        //stream.forEach(System.out::println);
        // 요소의 소모 : 스트림의 요소를 소모하여 연산을 수행
        // reduce() : 첫번째 요소와 두번째 요소를 가지고 연산을 수행한 후, 그 결과와 세번째 요소를 가지고 다시 연산
//        Stream<String> stream1 = Stream.of("하나", "둘", "셋", "넷");
//        Stream<String> stream2 = Stream.of("하나", "둘", "셋", "넷");
//        IntStream stream3 = IntStream.of(7,5,5,2,1,3,5,4,6);
//        OptionalInt reduce = stream3.reduce((s1, s2) -> s1 + s2);
//        System.out.println(reduce.getAsInt());
//        Optional<String> rst = stream1.reduce((s1, s2) -> s1 + "+" + s2);
//        rst.ifPresent(System.out::println);

        // 요소의 검색 : findFirst(), findAny() : 해당 스트림에서 첫번째 요소를 반환
        IntStream stream4 = IntStream.of(4,2,7,8,5,1,6);
        IntStream stream5 = IntStream.of(4,2,7,8,5,1,6);
        OptionalInt rst2 = stream4.sorted().findFirst();
        System.out.println(rst2.getAsInt());
        OptionalInt rst3 = stream5.sorted().findAny(); // 병렬처리 관련된 부분 포함, 첫번째 요소가 아닐 경우 있음
        System.out.println(rst3.getAsInt());

        // 요소의 검사
        // anyMatch() : 해당 스트림의 일부 요소가 조건에 만족하면 true
        // allMatch() : 모든 요소가 만족해야 true
        // noneMatch() : 모든 요소가 특정 조건을 만족하지 못할 경우 true
        IntStream stream6 = IntStream.of(30, 90, 70, 10);
        IntStream stream7 = IntStream.of(30, 90, 70, 10);
        IntStream stream8 = IntStream.of(30, 90, 70, 10);
//        System.out.println(stream6.anyMatch(n -> n > 80));
//        System.out.println(stream7.allMatch(n -> n > 80));
//        System.out.println(stream8.noneMatch(n -> n >80));

        // 요소의 통계 : count(), max(), min()
        IntStream stream9 = IntStream.of(30, 90, 70, 10);
        IntStream stream10 = IntStream.of(30, 90, 70, 10);
//        System.out.println(stream9.count());
//        System.out.println(stream10.max().getAsInt());

        // 요소의 연산
        IntStream stream11 = IntStream.of(30, 90, 70, 10);
        DoubleStream stream12 = DoubleStream.of(30.3, 90.9, 70.11, 10.12);
        System.out.println(stream11.sum());
        System.out.println(stream12.average().getAsDouble());
    }
}
