package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JLabel1 extends JFrame implements ActionListener {
    private JLabel result = new JLabel();
    private ImageIcon img1, img2;

    public JLabel1() {
        // 이미지 생성
        img1 = new ImageIcon("image\\apple.jpg");
        img2 = new ImageIcon("image/pear.jpg");

        // 버튼 생성
        JButton apple = new JButton("사과");
        JButton pear = new JButton("배");

        // 컨테이너 생성.
        Container ct = getContentPane();

        // 배치관리자 설정
        ct.setLayout(new FlowLayout());

        // 컨테이너 버튼과 라벨 추가.
        ct.add(apple);
        ct.add(pear);
        ct.add(result);

        // 버튼에 리스너 등록
        apple.addActionListener(this);
        pear.addActionListener(this);

        setTitle("버튼을 누르면 이미지를 보여주기");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("사과")) {
        	result.setText("맛있는 사과입니다");
            result.setIcon(img1);
        } else if (e.getActionCommand().equals("배")) {
        	result.setText("맛있는 배입니다");
            result.setIcon(img2);
        }
    }
}

public class JLabelTest1 {

    public static void main(String[] args) {
        new JLabel1();
    }
}
