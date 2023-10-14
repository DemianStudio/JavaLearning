package NadoCodingJava.chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        System.out.println("=== 문자열 비교 ===");
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        System.out.println();

        // 문자열 비교 심화
        System.out.println("=== 문자열 비교 심화 ===");
        // 하나의 메모지
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (침조)

        // 각각의 메모지
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // ture
        System.out.println(s1 == s2); // false
    }
}
