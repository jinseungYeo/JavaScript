package chapter14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

class JPanel1 extends JFrame{
	public JPanel1() {
		//프로그램으로부터 컨테이너 생성
		Container ct= getContentPane();
		
		//배치 관리자  FlowLayout
		ct.setLayout(new FlowLayout());
		
		ct.add(new JRadioButton("자바"));
		ct.add(new JRadioButton("C언어"));
		ct.add(new JRadioButton("JAVA Script"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("C#"));
		
		ct.add(new JRadioButton("자바#"));
		ct.add(new JRadioButton("C언어"));
		ct.add(new JRadioButton("JAVA Script"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("C#"));
		
		   setTitle("JPanel Test");
		      setSize(300,200);
		      
		      //윈도우 쪽 프로세스 닫기
		         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         //화면에 출력
		         setVisible(true);
	}
}
public class JpanelTest1 {

	public static void main(String[] args) {
		
		new JPanel1();
	}

}
