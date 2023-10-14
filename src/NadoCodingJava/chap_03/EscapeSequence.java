package NadoCodingJava.chap_03;

public class EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        System.out.println();

        System.out.println("=== 줄바꿈 ===");
        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        System.out.println();

        System.out.println("=== 탭 ===");
        // \t : 탭
        // 해물파전 9000원
        // 김치전  8000원
        // 부추전  8000원
        System.out.println("해물파전\t9000원\n김치전\t8000원\n부추전\t8000원");

        System.out.println();

        System.out.println("=== 역슬래시 ===");
        // \\ : 역슬래시(\\ => \)
        System.out.println("C:\\Program Files\\Java");

        System.out.println();

        System.out.println("=== 큰따옴표 ===");
        // \" : 큰따옴표
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        System.out.println();

        System.out.println("=== 작은따옴표 ===");
        // \' : 작은따옴표
        System.out.println("단비가 \'뭘 봐? \'라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println("c = " + c);

    }
}
