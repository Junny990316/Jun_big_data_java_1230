package 문자열다루기;
// equals method : 두개의 문자열이 동일한지 비교하여 결과값을 리턴
public class StringType {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";
        String c = "Hello";
        /*System.out.println(a.equals(b)); // a의 문자열과 b의 문자열을 비교
        System.out.println(a.equals(c)); // a의 문자열과 c의 문자열을 비교
        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분 안함
        System.out.println(a == c); // 문자열의 내용을 비교하는 것이 아니고 문자열의 참조. 즉 주소를 비교함*/

        String d = "Hello Jav Java";
        // indexOf : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
        /*System.out.println(d.indexOf("Java"));*/
        // contains : 문자열에서 특정 문자열의 포함여부를 리턴 (포함되어 있으면 true)
        System.out.println(d.contains("Hello")); // 대소문자 구분함
        //charAt : 문자열에서 특정 위치의 문자를 리턴 함
        System.out.println(d.charAt(0));
        // replaceAll : 문자열 중 특정 문자열을 다른 문자열로 대체할 때 사용
        String language = "Java, Python, c, c++, JavaScript, Kotlin, Swift";
        System.out.println(language.replaceAll("JavaScript", ""));
        // substring : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(5)); // 시작 인덱스부터 끝까지 추출
        System.out.println(e.substring(1, 4)); // 시작 인덱스 부터 종료 인덱스 미만까지 추출
        // toUppercase / toLowerCase : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim : 문자열 앞뒤에 있는 공백 제거
        String str = " 자바 프로그래밍  !  ! !!! ";
        System.out.println(str.trim());
        // 문자열 포메팅이란? : 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요)
        //System.out.printf("자바 프로그램을 %s 합시다. \n", "열심히");
        String newStr = "";
        int number = 18;
        String day = "three";
        newStr = String.format("I eat %d apples. so I was sick %s days", number, day);
        System.out.println(newStr);

        String newStr2 = "I ate " + number + " apples. so I was sick " + day + " days";
        System.out.println(newStr2);

        // toCharArray() : 문자열을 문자 배열 반환
        String name = "junny";
        char[] arrName = name.toCharArray(); // 문자열을 문자로 구성된 배열로 만듬
        System.out.println(name);
        System.out.println(arrName);
    }
}
