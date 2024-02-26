package ch06;

import java.util.Scanner;

public class HongAplication {

    private static Scanner scanner = new Scanner(System.in);
    private static Hong[] hongArray=new Hong[50];
    public static void main(String[] args) {

        boolean run=true;
        while (run){
            System.out.println("=====================");
            System.out.println("1.회원가입 | 2. 아이디 찾기 | 3.비밀번호 찾기 | 4.비밀번호 변경 | 5.회원탈퇴");
            System.out.println("=====================");

            int select=scanner.nextInt();
            switch (select){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
