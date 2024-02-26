package ch04;

import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//입력기능
        boolean bank = true;//실행상태
        int money = 10000;//잔고


        while (bank) {
            //메뉴생성
            System.out.println("==========================");
            System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
            System.out.println("==========================");

            System.out.print("선택> ");
            String strNum = scanner.nextLine();//입력받은 값을 저장


            if (strNum.equals("1")) {
                money += 1000;
                System.out.println("예금액: "+money);
            } else if (strNum.equals("2")) {
                money -= 2000;
                System.out.println("출금액:2000 ");
            } else if (strNum.equals("3")) {
                System.out.println("잔액: " + money);

            } else {
                bank = false;
            }
        }
        System.out.println("프로그램 종료");





    }
}
