package chapter14;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayout1 extends JFrame{
   public GridLayout1() {
      //프레임으로부터 컨테이너 생성.
      Container ct = getContentPane();
      
      //GridLayout 배치관리자 생성.
      GridLayout g1 = new GridLayout(4, 5, 10, 10);
      
      //컨테이너에 레이아웃 설정.
      ct.setLayout(g1);
      
      //20개의 버튼 컴포넌트를 생성하여 컨테이너에 추가.
      for(int i= 1; i<=20; i++) {
            ct.add(new JButton("버튼"+i));
       }
      
      setTitle("GridLayout Test");
      setSize(500,500);
      
      //윈도우 쪽 프로세스 닫기
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //화면에 출력
         setVisible(true);
      
   }
}

public class GridLayoutTest1 {

   public static void main(String[] args) {
      new GridLayout1();

   }

}