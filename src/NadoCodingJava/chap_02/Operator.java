package NadoCodingJava.chap_02;

public class Operator {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println("c = " + c);
        c = a - b;
        System.out.println("c = " + c);
        c = a * b;
        System.out.println("c = " + c);
        c = a / b;
        System.out.println("c = " + c);
        c = a % b;
        System.out.println("c = " + c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println("val = " + val);
        System.out.println("++val = " + ++val); // 연산 후 문장 실행
        System.out.println("val = " + val);
        System.out.println();
        val = 10;
        System.out.println("val = " + val);
        System.out.println("val++ = " + val++); // 실행 후 연산 실행
        System.out.println("val = " + val);
        System.out.println();
        val = 10;
        System.out.println("val = " + val);
        System.out.println("--val = " + --val); // 연산 후 문장 실행
        System.out.println("val = " + val);
        System.out.println();
        val = 10;
        System.out.println("val = " + val);
        System.out.println("val-- = " + val--); // 실행 후 연산 실행
        System.out.println("val = " + val);
        System.out.println();

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 " + waiting++);   // 0
        System.out.println("대기 인원 " + waiting++);   // 1
        System.out.println("대기 인원 " + waiting++);   // 2
        System.out.println("총 대기 인원 " +waiting);    // 3
    }
}
