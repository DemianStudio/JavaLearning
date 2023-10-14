package NadoCodingJava.chap_02;

public class Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        System.out.println("=== 대입 연산자 ===");
        int num = 10;
        num = num + 2;
        System.out.println("num = " + num); // 12

        num = num - 2;
        System.out.println("num = " + num); // 10

        num = num * 2;
        System.out.println("num = " + num); // 20

        num = num / 2;
        System.out.println("num = " + num); // 10

        num = num % 2;
        System.out.println("num = " + num); // 0

        System.out.println();

        System.out.println("=== 복합 대입 연산자");
        num = 10;

        // num = num + 2;
        num += 2;
        System.out.println("num = " + num); // 12

        // num = num -= 2;
        num -= 2;
        System.out.println("num = " + num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println("num = " + num); // 20

        // num = num / 2;
        num /= 2;
        System.out.println("num = " + num); // 10

        // num = num %/ 2;
        num %= 2;
        System.out.println("num = " + num); // 0



    }
}