package 클래스정렬예제1;
 // 자동차 연식으로 정렬하기
public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }


    @Override
    public int compareTo(CarSort o) {
        if (this.modelYear == o.modelYear){
            return this.modelName.compareTo(o.modelName); // 뒤에가 짧으면 양수
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름차순정렬)

    }
}
