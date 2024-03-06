package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
        System.out.println(sdf.format(now));
    }

}


