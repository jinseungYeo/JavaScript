package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// GUI 클래스
class JButton1 extends JFrame{
	public JButton1() {
		// 이미지 객체 생성.
		ImageIcon korea= new ImageIcon("image/korea1.gif");
		ImageIcon usa= new ImageIcon("image/usa.gif");
		ImageIcon germany= new ImageIcon("image/germany.gif");
		
		//버튼 객체 생성
		JButton nat = new JButton(korea); // 기본 지정 이미지는 태극기
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		//컨테이너 생성
		Container ct = getContentPane();
		//Flowrayout 설정
		ct.setLayout(new FlowLayout());
		//컨테이너에 버튼추가
		ct.add(nat);
		//화면에 보이기 500,400
		setTitle("JButton Test");
	      setSize(500,400);
	      setVisible(true);
	}
}
// 메인클래스
public class JButtonTest1 {

	public static void main(String[] args) {
		new JButton1();

	}
}


