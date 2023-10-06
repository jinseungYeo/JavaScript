package chapter14;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;

class FirstFrame2 extends JFrame {
    public FirstFrame2() {
        // 프레임으로부터 컨테이너(쟁반) 생성.
        Container ct = getContentPane();

        JButton jb = new JButton("테스트 버튼2");
        // 컨테이너에 버튼 추가
        ct.add(jb);

        // 프레임 제목 설정
        setTitle("두 번째 GUI 프로그램 - JFrame 상속");
        // 프레임 크기 설정
        setSize(400, 300);

        // 프레임을 화면에 출력
        setVisible(true);
    }
}

public class FrameTest2 {
    public static void main(String[] args) {
        // FirstFrame2 객체 생성
        new FirstFrame2();
    }
}
