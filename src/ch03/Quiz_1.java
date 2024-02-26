package ch03;

public class Quiz_1 {
    public static void main(String[] args) {
//        답: 31
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
//        x는 더한후 대입을 해서 11 y는 대입을 먼저하기 때문에 20
//        합해서 31


    }
}
