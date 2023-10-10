package chapter14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이벤트 처리클래스
class EventClass implements ActionListener {
    JLabel jl;

    public EventClass(JLabel jl) {
        this.jl = jl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jl.setText(e.getActionCommand());
    }
}

// GUI 이벤트 클래스 - 버튼 2개 레이블 1개
class Event3 extends JFrame {
    JLabel jl;
    JButton jb1, jb2;

    public Event3() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        jb1 = new JButton("안녕하세요.");
        jb2 = new JButton("행복한 하루입니다.");
        jl = new JLabel("버튼을 누르세요.");
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jl);
        jb1.addActionListener(new EventClass(jl));
        jb2.addActionListener(new EventClass(jl));
        setTitle("Event Test2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// 메인클래스
public class EventTest3 {

    public static void main(String[] args) {
        new Event3();
    }
}

