package NadoCodingJava.chap_02;

public class Quiz_02 {
    public static void main(String[] args) {
        System.out.println("=== Quiz_02 ===");
        System.out.println("어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.");
        System.out.println();
        System.out.println("=== 조건 ===");
        System.out.println("1. 키가 120cm 이상인 경우에만 탑승 가능");
        System.out.println("2. 삼항 연산자 이용");
        System.out.println();
        System.out.println("=== 결과 ===");
        // 풀이
        int limit = 120;
        int kidtall = 120;
        String notice = (limit <= kidtall) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        // 결과
        System.out.println("키가 " + kidtall + "cm 이므로 " + notice);
    }
}
