package NadoCodingJava.chap_04;

public class _05_For {
    public static void main(String[] args) {
        System.out.println("=== 반복문 For ===");
        for (int i = 0; i <= 10; i++) {
            System.out.println("어서오세요. " +i);
            System.out.println("환영합니다. " +i + "\n");
        }

        System.out.println("=== 짝수만 출력 ===");
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("=== 홀수만 출력 ===");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("=== 거꾸로 출력 ===");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("=== 1부터 10까지의 수들의 합 ===");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("1부터 10까지의 총 합은 " + sum);
    }
}
