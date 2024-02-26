package ch06.Quiz16;

public class q21 {

    //max 메소드 작성
    static int max(int[] arr) {

        int max = 0;
            if (arr == null || arr.length == 0) {
                return -999999;
            } else  {
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){

                max = arr[i];
            }
            }
        return max;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        // 크기가 0인 배열
        System.out.println("최대값:" + max(new int[]{}));
    }

}
