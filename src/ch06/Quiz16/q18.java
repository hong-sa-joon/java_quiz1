package ch06.Quiz16;

public class q18 {
    public class Example
    {
        int iv = 10;
        static int cv = 20;
        int iv2 = cv;
//        static int cv2 = iv; // 첫번째 컴파일 에러
        //iv가 정적 필드가 아니라 할당이 되지 않는다.


        static void staticMethod1() {
            System.out.println(cv);
//            System.out.println(iv); // 두번째 컴파일 에러
            //정적메소드에서는 정적 필드만 사용할 수 있다.
        }


        void instanceMethod1() {
            System.out.println(cv);
            System.out.println(iv);
        }


        static void staticMethod2() {
            staticMethod1();
//            instanceMethod1();   // 세번째 컴파일 에러
            //정적 메소드가 아니므로 사용불가하다.
        }


        void instanceMethod2() {
            staticMethod1();
            instanceMethod1();
        }
    }

}
