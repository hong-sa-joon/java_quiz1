package ch03;

public class Quiz_5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
//        답 : 1,2,3
        double area = ((double)(lengthTop+lengthBottom) * height / 2  );
//        double area = ((lengthTop+lengthBottom) * height * 1.0 / 2 );
//        double area = ((lengthTop+lengthBottom) * height / 2.0 );
        System.out.println(area);


    }
}
