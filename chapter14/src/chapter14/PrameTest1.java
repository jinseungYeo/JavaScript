package chapter14;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
class FirstFrame1 {
	//생성자
	public FirstFrame1() {
		JFrame jf = new JFrame("첫번째 GUI 프로그램");
		
		
		// 프레임으로부터 컨테이너(쟁반)생성.
		Container ct = jf.getContentPane();
		
		
		JButton jb = new JButton("테스트 버튼");
		// 컨테이너 버튼추가
		ct.add(jb);
		
		//프레임 크기
		jf.setSize(400,300);
		
		//프레임을 화면에 출력
		jf.setVisible(true);
		
	}
}
public class PrameTest1 {
	public static void main(String[] args) {
		new FirstFrame1();//
	}
}