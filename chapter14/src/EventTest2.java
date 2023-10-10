/*
내부 클래스를 이용한 이벤트처리
*/
package chapter14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event2 extends JFrame{
	//JLabel 객체를 속성으로 등록
	JLabel jl;
	
	 JButton jb1,jb2;
	 
	 //생산자
	 public Event2() {
		//컨테이너 생성
			Container ct= getContentPane();
			//배치 관리자 설정 (FlowLayout)
			ct.setLayout(new FlowLayout());
			jb1 = new JButton("안녕하세요.");
			jb2 = new JButton("행복한 하루입니다.");
			jl = new JLabel("버튼을 누르세요.");
			ct.add(jb1);
			ct.add(jb2);
			ct.add(jl);
			jb1.addActionListener(new EventProcess());
			jb2.addActionListener(new EventProcess());
			setTitle("Event Test2");
			setSize(300,200);
			//윈도우 창 종료시 프로세스 닫기
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	 }
	 private class EventProcess implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand());
			
		}
		 
	 }
}

public class EventTest2 {

	public static void main(String[] args) {
		new Event2();

	}

}
