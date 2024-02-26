package ch03;

public class Quiz_2 {
    public static void main(String[] args) {
//        답: 가
        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);
//        스코어가 90보다 크다를 부정하므로 크지 않을 시 true가 되기에 ‘가’가 나온다


    }
}
