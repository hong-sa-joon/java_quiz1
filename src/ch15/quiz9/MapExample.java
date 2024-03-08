package ch15.quiz9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수

        Set<Map.Entry<String, Integer>> scoreSet = map.entrySet();
        Iterator<Map.Entry<String , Integer>> scores= scoreSet.iterator();

        for (Map.Entry<String , Integer>entry : scoreSet){
            totalScore += entry.getValue();
        if (entry.getValue()>maxScore){
            maxScore=entry.getValue();
            name=entry.getKey();
        }
        }
int Score=totalScore / map.size();

        System.out.println("평균점수 : "+Score);
        System.out.println("최고점수 : "+maxScore);
        System.out.println("최고점수 학생 : "+name);
    }
}
