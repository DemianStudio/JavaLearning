package NadoCodingJava.chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        System.out.println("=== 조건문 ElseIf ===");
        // 조건문 Else If

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료!");

        System.out.println();

        // else-if는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;
        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오랜지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료!");

        System.out.println();

        // else는 없이도 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;
        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오랜지 주스 +1");
        }
            System.out.println("아이스 아메리카노 +1");

        System.out.println("주문 완료!");

    }
}
