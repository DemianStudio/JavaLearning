package NadoCodingJava.chap_01;

public class Quiz_01 {
    public static void main(String[] args) {
        System.out.println("=== Quiz_01 ===");
        System.out.println("버스 도착 정보를 출력하는 프로그램을 작성하시오.");
        System.out.println("각 정보는 적절한 자료형의 변수에 정의합니다.");
        System.out.println();
        System.out.println("=== 정보 ===");
        System.out.println("버스 번호는 '1234', '상암08'과 같은 형태");
        System.out.println("남은 시간은 분 단위 (예: 3분, 5분)");
        System.out.println("남은 거리는 km단위 (예: 1.5km, 0.8km)");
        System.out.println();
        System.out.println("=== 결과 ===");
        // 풀이
        int busNum = 1234; // 버스 번호
        String limitTime = "5분"; // 남은 시간
        double limitStreet = 1.5; // 남은 거리(km)
        // 결과
        System.out.println("버스 번호는 " + busNum + "버스");
        System.out.println("약 " + limitTime + " 후 도착");
        System.out.println("남은 거리는 " + limitStreet + "km");

    }
}
