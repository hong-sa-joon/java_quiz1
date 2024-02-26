package ch05;

public class Quiz9 {
    public static void main(String[] args) {

//        주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(힌트: 중첩 for 문 이용)

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int total = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].length;
            for (int j = 0; j < array[i].length; j++) {

                num += array[i][j];
            }
        }
        double avg2 = (double) num / total;
        System.out.println("평균: " + avg2);
        double avg = (double) num + total;
        System.out.println("합: " + avg);
    }
}
