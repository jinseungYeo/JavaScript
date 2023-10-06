package chapter14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame{
	public JPanel2() {
			//프로그램으로부터 컨테이너 생성
				Container ct= getContentPane();
				
				//배치 관리자  FlowLayout
				ct.setLayout(new BorderLayout(5,5));
			// 판넬1 객체 생성
			JPanel jp1 = new JPanel();
			//판넬1에 GridLayout 배치 관리자 설정 5줄 1칸
			jp1.setLayout(new GridLayout(5,1));
			
			//판넬1에 라디오 버튼을 추가
			jp1.add(new JRadioButton("자바"));
			jp1.add(new JRadioButton("C언어"));
			jp1.add(new JRadioButton("JAVA Script"));
			jp1.add(new JRadioButton("JSP"));
			jp1.add(new JRadioButton("C#"));
			//판넬2 객체 생성
			JPanel jp2 = new JPanel();
			jp2.setLayout(new GridLayout(5,1));
			
			//판넬2에 버튼 추가
			jp2.add(new JButton("자바"));
			jp2.add(new JButton("C언어"));
			jp2.add(new JButton("JAVA Script"));
			jp2.add(new JButton("JSP"));
			jp2.add(new JButton("C#"));
			
			//판넬3 객체 생성
			JPanel jp3 = new JPanel();
			//판넬3에 레이블 추가
			jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택하세요."));
			ct.add(jp1,BorderLayout.WEST);
			ct.add(jp2,BorderLayout.EAST);
			ct.add(jp3,BorderLayout.NORTH);
			 
			setTitle("JPanel Test");
		      setSize(300,200);
		      
		      //윈도우 쪽 프로세스 닫기
		         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         //화면에 출력
		         setVisible(true);
			
			
	}
	}
public class JpanelTest2 {

	public static void main(String[] args) {
		new JPanel2();

	}

}
