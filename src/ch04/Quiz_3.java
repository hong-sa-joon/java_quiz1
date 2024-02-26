package ch04;

public class Quiz_3 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                num += i;
            }
        }
            System.out.println("합계:" + num);
    }

}
