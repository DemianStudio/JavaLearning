public class Variable {
    public static void main(String[] args) {

//      Java 프로그래밍 - 변수와 자료형_1
//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");
        int age = 10;
        System.out.println("age = " + age);
        String country = "Korea";
        System.out.println("country = " + country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");

//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        System.out.println("apple = " + apple);
        int apple3 = 2000;
        System.out.println("apple3 = " + apple3);
        int _apple = 2000;
        System.out.println("_apple = " + _apple);
        int $apple = 2000;
        System.out.println("$apple = " + $apple);

//      2-2. 숫자로 시작 X
//        int 3apple = 2000;

//      2-3. 대소문자 구분
        int apple5 = 1000;
        System.out.println("apple5 = " + apple5);
        int Apple5 = 1000;
        System.out.println("Apple5 = " + Apple5);

//      2-4. 공백 사용 X
        int one_apple = 1000;
        System.out.println("one_apple = " + one_apple);
        int oneApple = 1000;
        System.out.println("oneApple = " + oneApple);
//        int one apple = 1000;

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...
//        int true = 1;
//        int false = 1;

//      참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println("사과 = " + 사과);

//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수
        int myAge = 20;
        System.out.println("myAge = " + myAge);
        int oneApplePrice = 10000;
        System.out.println("oneApplePrice = " + oneApplePrice);

//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        int MyAge = 20;
        System.out.println("MyAge = " + MyAge);
        int OneApplePrice = 10000;
        System.out.println("OneApplePrice = " + OneApplePrice);

//      참고) 스네이크 표기법 (snake_case)
        int my_age = 20;
        System.out.println("my_age = " + my_age);
        int one_apple_price = 10000;
        System.out.println("one_apple_price = " + one_apple_price);

    }
}