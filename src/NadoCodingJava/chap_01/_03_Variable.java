package NadoCodingJava.chap_01;

public class _03_Variable {
    public static void main(String[] args) {
        String name = "Demian";
        int hour = 15;

        System.out.println(name + "님! 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님! 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "박경덕";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시헙에 합격했을까요? " + pass);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        System.out.println(Integer.MAX_VALUE);
        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);

//        int, long, float, double, char, String, boolean
    }
}
