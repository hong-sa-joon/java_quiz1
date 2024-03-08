package ch14.quiz3;

import com.sun.source.tree.SynchronizedTree;

import java.util.concurrent.SynchronousQueue;

class VideoPlayer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MusicPlayer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//
//public class void Main {
//    public static void main(String[] args) {
//        // VideoPlayer와 MusicPlayer를 각각 생성하여 스레드로 실행
//        VideoPlayer videoThread = new VideoPlayer();
//        MusicPlayer musicThread = new MusicPlayer();
//
//        // 각각의 스레드 시작
//        videoThread.start();
//        musicThread.start();
//
//        // main 스레드에서 다른 스레드의 실행을 기다림
//        try {
//            videoThread.join();
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("메인 스레드 종료");
//    }
//}