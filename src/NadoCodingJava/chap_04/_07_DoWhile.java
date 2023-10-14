package NadoCodingJava.chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        System.out.println("=== 반복문 DoWhile ===");
        int distance = 25; // 전체 거리
        int move = 0; // 현재 이동 거리
        double height = 1.8; // 키 180

        while ((move + height) < distance) {
            System.out.println("밢차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println();
        System.out.println("=== 키가 엄청나게 큰 사람? ===");
        move = 0;
        height = 10.5;
        while (move + height < distance) {
            System.out.println("밢차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println();

        System.out.println("=== Do While 반복문 ===");
        do {
            System.out.println("밢차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }

}
