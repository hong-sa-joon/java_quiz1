package ch02;

public class quiz5 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
//        char var = (char) strValue;
// 객체 -> String
        //String은 객체를 저장하는 타입이다.(참조타입)
        //char 기본타입이므로 형변환이 되지 않는다.
    }
}
