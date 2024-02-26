package ch04;

public class Quiz_2 {
    public static void main(String[] args) {

      /*  for 문을 이용하여 1~100까지의 정수 중 3의 배수 총합을 구하는 코드를 작성하여 물음표(?)를 마저
        작성하세요.
*/

        int sum = 0;
        for (int i = 1; i < 100; i++) {
             if (i%3==0){
                 sum+=i;
        }
    }
        System.out.println("3의 배수의 합: " + sum);


}
}
