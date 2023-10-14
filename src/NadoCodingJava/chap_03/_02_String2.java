package NadoCodingJava.chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println("=== 문자열 변환 ===");
        System.out.println(s.replace(" and",","));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (이전 내용 삭제 후 출력)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("and"))); // 시작 위치부터 끝 위치 직전까지

        System.out.println();

        System.out.println("=== 공백 제거 ===");
        s = "        I love Java.";
        System.out.println("s = " + s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        System.out.println();

        System.out.println("=== 문자열 결합 ===");
        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
