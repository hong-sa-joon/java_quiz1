package ch05;

public class Quiz7 {
    public static void main(String[] args) {
//        다음 배열에 담긴 값을 모두 더하는 프로그램을 만드시오(힌트: for 문 이용)
        int[] arr = {10, 20, 30, 40, 50};
        int sum=0;
        for (int score : arr) {
            sum += score;

        }
        System.out.println(sum);
    }
}
