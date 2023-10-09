// Java 프로그래밍 - 변수와 자료형_2

public class DataType {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum);
        System.out.println("최소값 = " + Integer.MIN_VALUE);
        System.out.println("최대값 = " + Integer.MAX_VALUE);

        int intNum1 = Integer.MAX_VALUE;
        System.out.println("intNum1 = " + intNum1);
        int intNum2 = Integer.MAX_VALUE + 1 ;
        System.out.println("intNum2 = " + intNum2);
        long longNum = (long)Integer.MAX_VALUE + 1;
        System.out.println("longNum = " + longNum);

//      1-2. 실수
        float floatNum = 1.23f;
        System.out.println("floatNum = " + floatNum);
        System.out.println("최대값 = " + Float.MAX_VALUE);
        double doubleNum = 1.23;
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("최대값 = " + Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        System.out.println("0b" + Integer.toBinaryString(numBase2));
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        System.out.println("0" + Integer.toOctalString(numBase8));
        int numBase16 = 0xC;
        System.out.println("numBase2 = " + numBase2);
        System.out.println("0x"+ Integer.toHexString(numBase16));



//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);


//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        System.out.println((int)keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);
        System.out.println((int)keyLast);

    }
}
