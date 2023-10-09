public class Operator {
    public static void main(String[] args) {

//      Java 프로그래밍 - 여러가지 연산자_1
//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        System.out.println("result = " + result);
        result = numX - numY;
        System.out.println("result = " + result);
        result = numX * numY;
        System.out.println("result = " + result);
        result = numX / numY;
        System.out.println("result = " + result);
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println("numZ++ = " + numZ++);
        System.out.println("numZ = " + numZ);
        
        numZ = 1;
        System.out.println("++numZ = " + ++numZ);
        System.out.println("numZ = " + numZ);

        numZ = 1;
        System.out.println("numZ-- = " + numZ--);
        System.out.println("numZ = " + numZ);

        numZ = 1;
        System.out.println("--numZ = " + --numZ);
        System.out.println("numZ = " + numZ);

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 ==0));
        System.out.println((10 > 9) || (1 ==0));

//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
//        num1 = num1 + num2;
        System.out.println("num1 = " + num1);
        num1 -= num2;
        System.out.println("num1 = " + num1);
        num1 *= num2;
        System.out.println("num1 = " + num1);

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "Yes" : "No";
        System.out.println("aResult = " + aResult);

//      Java 프로그래밍 - 여러가지 연산자_2
//      7. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      7-1. AND 연산자 (&)
        int num3 = 5;
        int num4 = 3;
        int result1 = 0;

        result1 = num3 & num4;
        System.out.println("result1 = " + result1);
        System.out.println(Integer.toBinaryString(num3));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num3)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num4)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1)));

//      7-2. OR 연산자 (|)

        result1 = num3 | num4;
        System.out.println("result1 = " + result1);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num3)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num4)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1)));

//      7-3. XOR 연산자 (^)
        result1 = num3 ^ num4;
        System.out.println("result1 = " + result1);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num3)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num4)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1)));

//      7-4. 반전 연산자 (~)
        num3 = 5;

        result1 = ~num3;
        System.out.println("result1 = " + result1);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num3)));
        System.out.printf("%s\n", Integer.toBinaryString(result1));

//      8. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      8-1. << 연산자
        int numC = 3;
        result1 = numC << 1;
        System.out.println("result1 = " + result1);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numC)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1)));

//      8-2. >> 연산자
        result1 = numC >> 1;
        System.out.println("result1 = " + result1);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numC)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1)));

//      8-3. >>> 연산자
        numC = -5;
        result1 = numC >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numC));
        System.out.printf("%s\n", Integer.toBinaryString(result1));

        result1 = numC >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numC));
        System.out.printf("%s\n", Integer.toBinaryString(result1));

    }

}
