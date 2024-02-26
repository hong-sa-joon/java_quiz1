package ch04;

public class Quiz_7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; //세번째 값


        for (int i=0;i<8;i++){//이미 위에서 수열의 첫번째(num1),두번째(num2)를 출력했으므로 8번만 반복하면 됌
            num3=num1 + num2;//세번째 값을 만든다
            System.out.println(","+num3);
            num1=num2;//두번째 수열을 첫번째 값으로 만든다.
            num2=num3;//세번째 수열을 두번째 값으로 만든다.
        }
    }

}
