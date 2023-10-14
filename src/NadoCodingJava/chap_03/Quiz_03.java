package NadoCodingJava.chap_03;

public class Quiz_03 {
    public static void main(String[] args) {
        System.out.println("=== Quiz_03 ===");
        System.out.println("주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.");
        System.out.println();
        System.out.println("=== 참고 ===");
        System.out.println("1. 주민등록번호는 13자리의 숫자로 구성");
        System.out.println("2. 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보");
        System.out.println("3. 입력 데이터는 '-'을 포함한 14자리의 문자열 형태");
        System.out.println();
        System.out.println("=== 예시 ===");
        System.out.println("\"901231-1234567\"인 경우 901231-1까지 출력");
        System.out.println("\"030708-4567890\"인 경우 030708-4까지 출력");
        System.out.println();
        System.out.println("=== 결과 ===");
        // 풀이
        String M = "901231-1234567";
        String W = "030708-456789";


        // 결과
        System.out.println(M.substring(0, 8));
        System.out.println(W.substring(0, 8));
        System.out.println(M.substring(0, M.indexOf("-")+2));
        System.out.println(W.substring(0, W.indexOf("-")+2));
        System.out.println(M.substring(M.indexOf("9"), M.lastIndexOf("2")));
        System.out.println(W.substring(W.indexOf("0"), W.indexOf("5")));
    }
}
