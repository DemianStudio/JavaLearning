package NadoCodingJava.chap_04;

import java.lang.invoke.SwitchPoint;

public class _04_SwitchCase {
    public static void main(String[] args) {
        System.out.println("=== Switch Case ===");
        // 석차에 따른 장학금 지금
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if else문을 이용한 방법(여러 조건 또는 범위에 해당하는 조건)
        int ranking = 1; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금 대상자");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금 대상자");
        } else {
            System.out.println("장학금 대상자가 아닙니다.");
        }
        System.out.println("조회 완료!");

        System.out.println();

        // Switch Case문을 이용한 방법(명확한 케이스가 있는 경우)
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금 대상자!!!");
                break;
            case 2:
                System.out.println("반액 장학금 대상자!!!");
                break;
            case 3:
                System.out.println("반액 장학금 대상자!!!");
                break;
            default:
                System.out.println("장학금 대상자가 아닙니다.");
        }
        System.out.println("조회 완료!");

        System.out.println();

        // case 2와 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금 대상자!!!");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금 대상자!!!");
                break;
            default:
                System.out.println("장학금 대상자가 아닙니다.");
        }
        System.out.println("조회 완료!");

        System.out.println();

        // 중고 상품의 등급에 따른 가격 (1급 : 최상, 4급 : 최하)
        int grade = 4; // 등급
        int price = 7000; // 기본 가격

        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
            default:
                price -= 3000;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
