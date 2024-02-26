package ch03;

public class Quiz_11 {
    public static void main(String[] args) {

            byte a = 10;
            byte b = 20;
            int c =(byte) (a + b);//byte + byte = int (byte)강제타입 변환 시켜주면 가능

            char ch = 'A';
//            ch = ch + 2//int 형으로 인식;
            ch =(char) (ch + 2);//해결

//            float f = 3 / 2;//정수연산 결과는 정수
            float f = 3 / 2.0f;//해결
//            long l = 3000 * 3000 * 3000;
// int의 허용번위를 넘기 때문에 올바른 값이 안나온다 long형태로 변환시켜준다
            long l = (long)3000 * 3000 * 3000;
            float f2 = 0.1f;

            double d = 0.1;
//            boolean result = d==f2;
// float와 double을 비교연산을 했을 때 실수의 타입을 맞춰주어야 한다.(타입변환필요)
            boolean result = (float)d==f2;

            System.out.println("c="+c);
            System.out.println("ch="+ch);
            System.out.println("f="+f);
            System.out.println("l="+l);
            System.out.println("result="+result);

    }
}
