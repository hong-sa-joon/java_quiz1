package ch04;

public class Quiz_6 {
    public static void main(String[] args) {
//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

        for (int m = 1; m <= 6; m++) {
            for (int n = 1; n <= 6; n++) {
                if (n + m == 6) {
                    System.out.println(n+"+"+m+"=6");
                }
            }
        }
    }
}
