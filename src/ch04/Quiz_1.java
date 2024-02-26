package ch04;

public class Quiz_1 {
    public static void main(String[] args) {
   /*     다음 문장들을 조건식으로 표현하시오.
        1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식-> 10 < x && x < 20
        2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
        5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
        나눠떨어지지 않을 때 true인 조건식
        7. boolean형 변수 powerOn가 false일 때 true인 조건식
        8. 문자열 참조변수 str이 “yes”일 때 true인 조건
*/


        int x = 5;
        char ch = ' ';
        int year = 0;
        boolean powerOn = true;
        String str = "yes";
        if (10 > x && x < 20) {
            System.out.println("1-1번 문제");
        }

        if (ch != ' ') {
            System.out.println("1-2번 문제");
        }
        if (ch == 'A' || ch == 'a') {
            System.out.println("1-3번 문제");
        }
        if (ch == 0 || ch == 9) {
            System.out.println("1-4번문제");
        }
        if (ch == 'A' || ch == 'a') {
            System.out.println("1-5번 문제");
        }
        if (year / 400 == 0 || year / 4 == 0 || year / 100 != 0) {
            System.out.println("1-6번 문제");
        }
        if (powerOn = false) {
            System.out.println("1-7번 문제");
        }
        if (str=="yes"){
            System.out.println("1-8번 문제");
        }
    }
}
