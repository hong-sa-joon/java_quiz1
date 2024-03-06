package ch12;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <= 100 ; i++) {
            sb.append(i);
        }

        String str = sb.toString();
        System.out.println(str);
    }
}

