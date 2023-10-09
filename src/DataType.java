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

//      4. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      4-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        String s5 = new String("Hi");
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s5));
        System.out.println(s3 == s5);

//      4-2. indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));
        System.out.println(s6.indexOf("!", 6));

//      4-3. replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);

//      4-4. substring
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!") + 1));

//      4-5. toUpperCase
        System.out.println(s7.toUpperCase());

//      5. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b;
        System.out.println(a);
        System.out.println(a == bak);

//      6. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[0]);
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);
        System.out.println(myArray2[3]);
        System.out.println(myArray2[4]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);

    }
}
