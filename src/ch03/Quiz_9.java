package ch03;

import java.util.Scanner;

public class Quiz_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력: ");
        int num= scanner.nextInt();
//        조건이 3개 이상임ㄴ 삼항 연산자 중첩
        System.out.println(num > 0 ? "양수":(num < 0 ? "음수":"0"));

    }
}
